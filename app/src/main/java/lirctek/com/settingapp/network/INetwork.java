package lirctek.com.settingapp.network;

import java.util.List;

import lirctek.com.settingapp.model.ServerDataModel;
import lirctek.com.settingapp.model.User;

/**
 * Created by Priya on 07-12-2017.
 */

public interface INetwork {

    void gettingData(User user, UiCallBack<List<ServerDataModel>> uiCallBack);

}
