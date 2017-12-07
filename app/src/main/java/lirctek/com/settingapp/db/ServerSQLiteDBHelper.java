package lirctek.com.settingapp.db;


import android.content.ClipData;

import com.activeandroid.query.Select;

import java.util.List;

import lirctek.com.settingapp.model.LocalDataModel;
import lirctek.com.settingapp.model.ServerDataModel;

import static android.R.attr.category;
import static android.R.attr.id;

/**
 * Created by Priya on 07-12-2017.
 */

public class ServerSQLiteDBHelper {



    public void updateDB(LocalDataModel dataModel)
    {
        dataModel.save();
    }

    public Long insertDB(ServerDataModel dataModel)
    {
        LocalDataModel data = getLocalData(dataModel);
        return data.save();


    }

    public List<LocalDataModel> getAllData()
    {

        return new Select()
                .from(LocalDataModel.class)
                .execute();

    }

    private LocalDataModel getLocalData(ServerDataModel dataModel)
    {
        LocalDataModel localDataModel = new LocalDataModel();
        localDataModel.address=dataModel.getAddress();
        localDataModel.cargoType=dataModel.getCargoType();
        localDataModel.carrierCity=dataModel.getCarrierCity();
        localDataModel.carrierState=dataModel.getCarrierState();
        localDataModel.carrierZip=dataModel.getCarrierZip();
        localDataModel.company=dataModel.getCompany();
        localDataModel.companyName=dataModel.getCompanyName();
        localDataModel.cycleType=dataModel.getCycleType();
        localDataModel.dLIssuedState=dataModel.getDLIssuedState();
        localDataModel.dOTNumber=dataModel.getDOTNumber();
        localDataModel.drivingLicense = dataModel.getDrivingLicense();
        localDataModel.eLDId=dataModel.getELDId();
        localDataModel.eLDManufacturer=dataModel.getELDManufacturer();
        localDataModel.eLogCategory=dataModel.getELogCategory();
        localDataModel.email=dataModel.getEmail();
        localDataModel.firstName=dataModel.getFirstName();
        localDataModel.homeTerminalAddress=dataModel.getHomeTerminalAddress();
        localDataModel.homeTerminalCity=dataModel.getHomeTerminalCity();
        localDataModel.homeTerminalState=dataModel.getHomeTerminalState();
        localDataModel.homeTerminalZip=dataModel.getHomeTerminalZip();
        localDataModel.id=dataModel.getId();
        localDataModel.isEld=dataModel.getIsEld();
        localDataModel.isFullLoad=dataModel.getIsFullLoad();
        localDataModel.isLTL=dataModel.getIsLTL();
        localDataModel.isPremiumPlan=dataModel.getIsPremiumPlan();
        localDataModel.isTms=dataModel.getIsTms();
        localDataModel.lastName=dataModel.getLastName();
        localDataModel.password=dataModel.getPassword();
        localDataModel.phone=dataModel.getPhone();
        localDataModel.signature=dataModel.getSignature();
        localDataModel.timeZone=dataModel.getTimeZone();
        localDataModel.splitFullLoad=dataModel.getSplitFullLoad();
        localDataModel.periodStartingTime=dataModel.getPeriodStartingTime();
        localDataModel.truckNumber=dataModel.getTruckNumber();
        localDataModel.truck=dataModel.getTruck();
        localDataModel.truck=dataModel.getTruck();

        return localDataModel;
    }
}
