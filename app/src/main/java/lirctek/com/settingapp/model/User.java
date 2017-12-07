package lirctek.com.settingapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priya on 07-12-2017.
 */

public class User {

    @SerializedName("User_Id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
