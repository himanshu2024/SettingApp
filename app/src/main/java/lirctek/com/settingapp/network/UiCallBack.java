package lirctek.com.settingapp.network;

/**
 * Created by Priya on 07-12-2017.
 */

public interface UiCallBack<T> {

    void onSuccess(T t);

    void onError(String errorMessage, ErrorCode code);

    /*public void onError(String errorMessage, ErrorCode code) {

    }

    public void onError(int errorId, ErrorCode code) {
        this.onError(AppLib.getContext().getString(errorId),code);
    }*/
}
