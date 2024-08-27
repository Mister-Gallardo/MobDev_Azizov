package ru.mirea.azizovav.cryptoloader;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class MyLoader extends AsyncTaskLoader<String> {

    public static final String ARG_WORD = "arg_word";

    private byte[] cryptText;
    private byte[] key;

    public MyLoader(@NonNull Context context, Bundle args) {
        super(context);
        if (args != null) {
            cryptText = args.getByteArray(ARG_WORD);
            key = args.getByteArray("key");
        }
    }

    @Nullable
    @Override
    public String loadInBackground() {
        SecretKey originalKey = new SecretKeySpec(key, 0, key.length, "AES");
        return Utils.decryptMsg(cryptText, originalKey);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}

