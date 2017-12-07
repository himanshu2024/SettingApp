package lirctek.com.settingapp.network;

import android.content.Context;

/**
 * Created by Priya on 07-12-2017.
 */

public class AppLib {
    private static AppLib appLib;
    private static INetwork client;
    private static Context appContext;

    private AppLib(Context context) {
        appContext = context;
    }

    public static AppLib getAppLib(Context context) {
        if (appLib == null) {
            appLib = new AppLib(context);
        }
        return appLib;
    }

    public static AppLib getAppLib() {
        return appLib;
    }

    public INetwork getNetworkClient() {
        if (appContext == null) {
            return null;
        }
        if (client == null) {
            client = new RestClient();
        }
        return client;
    }

    public static Context getContext(){
        return appContext;
    }

}