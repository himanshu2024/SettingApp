package lirctek.com.settingapp.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import lirctek.com.settingapp.model.ServerDataModel;
import lirctek.com.settingapp.model.User;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Priya on 07-12-2017.
 */

public class RestClient implements INetwork {

    ApiCall iNetwork;

    static final String BASE_URL = "http://beta.etruckingsoft.com:8800/";
    static final String AUTH_HEADER = "Bearer eyJhbGciOiJIUzI1NiJ9.MjI.ug9Y5o8aJGyGxAGJHGWC4hlRVhe5K5_MyAPuxIpRAe0";


    RestClient() {


        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        iNetwork = retrofit.create(ApiCall.class);
    }


    @Override
    public void gettingData(User user, UiCallBack<List<ServerDataModel>> uiCallBack) {
        Call<List<ServerDataModel>> resp = iNetwork.getServerData(AUTH_HEADER, user);
        resp.enqueue(new NetworkCallBack<List<ServerDataModel>>(uiCallBack));
    }
}