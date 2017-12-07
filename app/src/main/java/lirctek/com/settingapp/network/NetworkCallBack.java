package lirctek.com.settingapp.network;

import com.google.gson.JsonParseException;

import java.io.IOException;
import java.net.SocketTimeoutException;

import lirctek.com.settingapp.R;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Priya on 07-12-2017.
 */

public class NetworkCallBack<T> implements retrofit2.Callback {

    private UiCallBack uiCallBack;

    public NetworkCallBack(UiCallBack<T> uiCallBack) {
        this.uiCallBack = uiCallBack;
    }

    @Override
    public void onResponse(Call call, Response response) {
        if (!response.isSuccessful()) {
            switch (response.code()) {
                case 404:
                    uiCallBack.onError("Something went wrong ", ErrorCode.INTERNAL_SERVER_ERROR);
                    break;
                case 500:
                    uiCallBack.onError("INTERNAL SERVER ERROR", ErrorCode.INTERNAL_SERVER_ERROR);
                    break;
                default:
                    uiCallBack.onError("Something went wrong ", ErrorCode.UNKNOWN_ERROR);
            }
            return;
        }
        Object body = response.body();
        if (body != null && body instanceof String) {
            uiCallBack.onError("Something went wrong ",response.code()==200?ErrorCode.SERVER_RESPONSE:ErrorCode.BAD_INPUT);
            return;
        }
        uiCallBack.onSuccess(body);
    }

    @Override
    public void onFailure(Call call, Throwable t) {
        if (t instanceof IOException) {
            uiCallBack.onError("NO_INTERNET", ErrorCode.NO_NETWORK);
            return;
        } else if (t instanceof JsonParseException) {
            uiCallBack.onError("Something went wrong ", ErrorCode.INTERNAL_SERVER_ERROR);
            return;
        }else if(t instanceof SocketTimeoutException){
            uiCallBack.onError("Something went wrong ", ErrorCode.NO_NETWORK);
            return;
        }
        uiCallBack.onError("Something went wrong ", ErrorCode.UNKNOWN_ERROR);

    }
}
