package com.chutien.testgcm.app;

/**
 * Created by ${LTG} on ${10/12/1994}.
 */
import android.app.Application;

import com.chutien.testgcm.helper.ParseUtils;


public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}