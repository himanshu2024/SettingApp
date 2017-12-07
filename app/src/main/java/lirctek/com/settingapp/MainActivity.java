package lirctek.com.settingapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.List;

import lirctek.com.settingapp.Signature.SignatureFragment;
import lirctek.com.settingapp.carrier.CarrierFragment;
import lirctek.com.settingapp.db.ServerSQLiteDBHelper;
import lirctek.com.settingapp.driver.DriverFragment;
import lirctek.com.settingapp.model.LocalDataModel;
import lirctek.com.settingapp.model.ServerDataModel;
import lirctek.com.settingapp.model.User;
import lirctek.com.settingapp.network.AppLib;
import lirctek.com.settingapp.network.ErrorCode;
import lirctek.com.settingapp.network.UiCallBack;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, UiCallBack<List<ServerDataModel>> {

    private PagerAdapter mAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private LocalDataModel localDataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        networkCall();
    }

    private void networkCall()
    {
        User u = new User();
        u.setUserId(1102);

        AppLib.getAppLib(this).getNetworkClient().gettingData(u,this);

    }

    private void setupViewPager() {
        mAdapter = new PagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(DriverFragment.newInstance(localDataModel.id,localDataModel.firstName,localDataModel.lastName,localDataModel.phone,localDataModel.email,localDataModel.truck+"", localDataModel.trailerNumber), getString(R.string.driver));
        mAdapter.addFragment(CarrierFragment.newInstance(localDataModel.id,localDataModel.firstName,localDataModel.lastName,localDataModel.phone,localDataModel.email,localDataModel.truck+"", localDataModel.trailerNumber), getString(R.string.carrier));
        mAdapter.addFragment(SignatureFragment.newInstance("",""), getString(R.string.signature));
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(mAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onSuccess(List<ServerDataModel> serverDataModel) {
        Log.i("sdc","0");
        ServerSQLiteDBHelper dbHelper = new ServerSQLiteDBHelper();
        long s = dbHelper.insertDB(serverDataModel.get(0));
        //localDataModel = dbHelper.getAllData().get(0);

        localDataModel = dbHelper.getLocalData(serverDataModel.get(0));
        setupViewPager();

    }

    @Override
    public void onError(String errorMessage, ErrorCode code) {
        Toast.makeText(this,errorMessage,Toast.LENGTH_LONG).show();
    }
}
