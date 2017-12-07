package lirctek.com.settingapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Priya on 07-12-2017.
 */

@Table(name = "Items")
public class LocalDataModel extends Model {
    @Column(name = "Id")
    public Integer id;
    @Column(name = "User")
    public Integer user;
    @Column(name = "FirstName")
    public String firstName;
    @Column(name = "LastName")
    public String lastName;
    @Column(name = "Phone")
    public String phone;
    @Column(name = "Email")
    public String email;
    @Column(name = "Username")
    public String username;
    @Column(name = "Password")
    public Object password;
    @Column(name = "Company")
    public Integer company;
    @Column(name = "CompanyName")
    public String companyName;
    @Column(name = "Address")
    public String address;
    @Column(name = "CarrierCity")
    public String carrierCity;
    @Column(name = "CarrierState")
    public String carrierState;
    @Column(name = "CarrierZip")
    public String carrierZip;
    @Column(name = "HomeTerminalAddress")
    public String homeTerminalAddress;
    @Column(name = "HomeTerminalCity")
    public String homeTerminalCity;
    @Column(name = "HomeTerminalState")
    public String homeTerminalState;
    @Column(name = "HomeTerminalZip")
    public String homeTerminalZip;
    @Column(name = "Signature")
    public String signature;
    @Column(name = "CycleType")
    public Integer cycleType;
    @Column(name = "TimeZone")
    public String timeZone;
    @Column(name = "DrivingLicense")
    public String drivingLicense;
    @Column(name = "DLIssuedState")
    public Object dLIssuedState;
    @Column(name = "CargoType")
    public String cargoType;
    @Column(name = "TruckNumber")
    public String truckNumber;
    @Column(name = "Truck")
    public Integer truck;
    @Column(name = "TrailerNumber")
    public String trailerNumber;
    @Column(name = "ELogCategory")
    public Integer eLogCategory;
    @Column(name = "ELDManufacturer")
    public Object eLDManufacturer;
    @Column(name = "PeriodStartingTime")
    public Object periodStartingTime;
    @Column(name = "DOTNumber")
    public String dOTNumber;
    @Column(name = "ELDId")
    public String eLDId;
    @Column(name = "IsPremiumPlan")
    public Integer isPremiumPlan;
    @Column(name = "IsEld")
    public Integer isEld;
    @Column(name = "IsTms")
    public Integer isTms;
    @Column(name = "SplitFullLoad")
    public Integer splitFullLoad;
    @Column(name = "IsFullLoad")
    public Integer isFullLoad;
    @Column(name = "IsLTL")
    public Integer isLTL;

    public LocalDataModel() {
        super();
    }




}
