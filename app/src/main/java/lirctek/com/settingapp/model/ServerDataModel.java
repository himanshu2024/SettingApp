package lirctek.com.settingapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priya on 07-12-2017.
 */


public class ServerDataModel {

    @SerializedName("Id")
    private Integer id;
    @SerializedName("User")
    private Integer user;
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("LastName")
    private String lastName;
    @SerializedName("Phone")
    private String phone;
    @SerializedName("Email")
    private String email;
    @SerializedName("Username")
    private String username;
    @SerializedName("Password")
    private Object password;
    @SerializedName("Company")
    private Integer company;
    @SerializedName("CompanyName")
    private String companyName;
    @SerializedName("Address")
    private String address;
    @SerializedName("CarrierCity")
    private String carrierCity;
    @SerializedName("CarrierState")
    private String carrierState;
    @SerializedName("CarrierZip")
    private String carrierZip;
    @SerializedName("HomeTerminalAddress")
    private String homeTerminalAddress;
    @SerializedName("HomeTerminalCity")
    private String homeTerminalCity;
    @SerializedName("HomeTerminalState")
    private String homeTerminalState;
    @SerializedName("HomeTerminalZip")
    private String homeTerminalZip;
    @SerializedName("Signature")
    private String signature;
    @SerializedName("CycleType")
    private Integer cycleType;
    @SerializedName("TimeZone")
    private String timeZone;
    @SerializedName("DrivingLicense")
    private String drivingLicense;
    @SerializedName("DLIssuedState")
    private Object dLIssuedState;
    @SerializedName("CargoType")
    private String cargoType;
    @SerializedName("TruckNumber")
    private String truckNumber;
    @SerializedName("Truck")
    private Integer truck;
    @SerializedName("TrailerNumber")
    private String trailerNumber;
    @SerializedName("ELogCategory")
    private Integer eLogCategory;
    @SerializedName("ELDManufacturer")
    private Object eLDManufacturer;
    @SerializedName("PeriodStartingTime")
    private Object periodStartingTime;
    @SerializedName("DOTNumber")
    private String dOTNumber;
    @SerializedName("ELDId")
    private String eLDId;
    @SerializedName("IsPremiumPlan")
    private Integer isPremiumPlan;
    @SerializedName("IsEld")
    private Integer isEld;
    @SerializedName("IsTms")
    private Integer isTms;
    @SerializedName("SplitFullLoad")
    private Integer splitFullLoad;
    @SerializedName("IsFullLoad")
    private Integer isFullLoad;
    @SerializedName("IsLTL")
    private Integer isLTL;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarrierCity() {
        return carrierCity;
    }

    public void setCarrierCity(String carrierCity) {
        this.carrierCity = carrierCity;
    }

    public String getCarrierState() {
        return carrierState;
    }

    public void setCarrierState(String carrierState) {
        this.carrierState = carrierState;
    }

    public String getCarrierZip() {
        return carrierZip;
    }

    public void setCarrierZip(String carrierZip) {
        this.carrierZip = carrierZip;
    }

    public String getHomeTerminalAddress() {
        return homeTerminalAddress;
    }

    public void setHomeTerminalAddress(String homeTerminalAddress) {
        this.homeTerminalAddress = homeTerminalAddress;
    }

    public String getHomeTerminalCity() {
        return homeTerminalCity;
    }

    public void setHomeTerminalCity(String homeTerminalCity) {
        this.homeTerminalCity = homeTerminalCity;
    }

    public String getHomeTerminalState() {
        return homeTerminalState;
    }

    public void setHomeTerminalState(String homeTerminalState) {
        this.homeTerminalState = homeTerminalState;
    }

    public String getHomeTerminalZip() {
        return homeTerminalZip;
    }

    public void setHomeTerminalZip(String homeTerminalZip) {
        this.homeTerminalZip = homeTerminalZip;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getCycleType() {
        return cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Object getDLIssuedState() {
        return dLIssuedState;
    }

    public void setDLIssuedState(Object dLIssuedState) {
        this.dLIssuedState = dLIssuedState;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public Integer getTruck() {
        return truck;
    }

    public void setTruck(Integer truck) {
        this.truck = truck;
    }

    public String getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public Integer getELogCategory() {
        return eLogCategory;
    }

    public void setELogCategory(Integer eLogCategory) {
        this.eLogCategory = eLogCategory;
    }

    public Object getELDManufacturer() {
        return eLDManufacturer;
    }

    public void setELDManufacturer(Object eLDManufacturer) {
        this.eLDManufacturer = eLDManufacturer;
    }

    public Object getPeriodStartingTime() {
        return periodStartingTime;
    }

    public void setPeriodStartingTime(Object periodStartingTime) {
        this.periodStartingTime = periodStartingTime;
    }

    public String getDOTNumber() {
        return dOTNumber;
    }

    public void setDOTNumber(String dOTNumber) {
        this.dOTNumber = dOTNumber;
    }

    public String getELDId() {
        return eLDId;
    }

    public void setELDId(String eLDId) {
        this.eLDId = eLDId;
    }

    public Integer getIsPremiumPlan() {
        return isPremiumPlan;
    }

    public void setIsPremiumPlan(Integer isPremiumPlan) {
        this.isPremiumPlan = isPremiumPlan;
    }

    public Integer getIsEld() {
        return isEld;
    }

    public void setIsEld(Integer isEld) {
        this.isEld = isEld;
    }

    public Integer getIsTms() {
        return isTms;
    }

    public void setIsTms(Integer isTms) {
        this.isTms = isTms;
    }

    public Integer getSplitFullLoad() {
        return splitFullLoad;
    }

    public void setSplitFullLoad(Integer splitFullLoad) {
        this.splitFullLoad = splitFullLoad;
    }

    public Integer getIsFullLoad() {
        return isFullLoad;
    }

    public void setIsFullLoad(Integer isFullLoad) {
        this.isFullLoad = isFullLoad;
    }

    public Integer getIsLTL() {
        return isLTL;
    }

    public void setIsLTL(Integer isLTL) {
        this.isLTL = isLTL;
    }


}
