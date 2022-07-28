package com.android.internal.util.somethingos;

import android.content.ContentResolver;
import android.content.Context;
import android.os.UserHandle;
import android.provider.Settings;

public class QSLayoutCustomizer {

    private static boolean mShouldUseOneplusStyle;
    private Context mContext;

    public QSLayoutCustomizer(Context context) {
        this.mContext = context;
        mShouldUseOneplusStyle = checkOneplusStyle();
    }

    public static boolean isQsLayoutEnabled() {
        return mShouldUseOneplusStyle;
    }

    private boolean checkOneplusStyle() {
        return !(Settings.Global.getInt(mContext.getContentResolver(),
        "USE_OOS_LAYOUT", 0) == 0);
    }
}