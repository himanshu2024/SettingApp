package lirctek.com.settingapp;


import com.activeandroid.ActiveAndroid;

/**
 * Created by Priya on 07-12-2017.
 */

public class MyApplication extends android.app.Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

}
