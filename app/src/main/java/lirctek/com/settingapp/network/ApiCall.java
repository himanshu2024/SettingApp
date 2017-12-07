package lirctek.com.settingapp.network;

import java.util.List;

import lirctek.com.settingapp.model.ServerDataModel;
import lirctek.com.settingapp.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by Priya on 07-12-2017.
 */

public interface ApiCall  {

    @POST("driver/getDriverInfobyUserIdElogApp")
    Call<List<ServerDataModel>> getServerData(@Header("Authorization") String authHeader, @Body User data);
}
