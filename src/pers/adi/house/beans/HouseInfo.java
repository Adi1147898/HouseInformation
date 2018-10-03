package pers.adi.house.beans;

public class HouseInfo {
    private Integer houseId;
    private String houseName;
    private String houseType;
    private String houseFloor;
    private String houseFloorSpace;
    private String houseDecorate;
    private String houseLocation;
    private Double houseRentMoney;
    private String houseLandlord;
    private String houseLandlordTelphone;
    private Byte houseIsrent;

    public HouseInfo() {
    }

    public HouseInfo(String houseName, String houseType, String houseFloor, String houseFloorSpace, String houseDecorate, String houseLocation, Double houseRentMoney, String houseLandlord, String houseLandlordTelphone, Byte houseIsrent) {
        this.houseName = houseName;
        this.houseType = houseType;
        this.houseFloor = houseFloor;
        this.houseFloorSpace = houseFloorSpace;
        this.houseDecorate = houseDecorate;
        this.houseLocation = houseLocation;
        this.houseRentMoney = houseRentMoney;
        this.houseLandlord = houseLandlord;
        this.houseLandlordTelphone = houseLandlordTelphone;
        this.houseIsrent = houseIsrent;
    }

    public HouseInfo(Integer houseId, String houseName, String houseType, String houseFloor, String houseFloorSpace, String houseDecorate, String houseLocation, Double houseRentMoney, String houseLandlord, String houseLandlordTelphone, Byte houseIsrent) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.houseType = houseType;
        this.houseFloor = houseFloor;
        this.houseFloorSpace = houseFloorSpace;
        this.houseDecorate = houseDecorate;
        this.houseLocation = houseLocation;
        this.houseRentMoney = houseRentMoney;
        this.houseLandlord = houseLandlord;
        this.houseLandlordTelphone = houseLandlordTelphone;
        this.houseIsrent = houseIsrent;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(String houseFloor) {
        this.houseFloor = houseFloor;
    }

    public String getHouseFloorSpace() {
        return houseFloorSpace;
    }

    public void setHouseFloorSpace(String houseFloorSpace) {
        this.houseFloorSpace = houseFloorSpace;
    }

    public String getHouseDecorate() {
        return houseDecorate;
    }

    public void setHouseDecorate(String houseDecorate) {
        this.houseDecorate = houseDecorate;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public Double getHouseRentMoney() {
        return houseRentMoney;
    }

    public void setHouseRentMoney(Double houseRentMoney) {
        this.houseRentMoney = houseRentMoney;
    }

    public String getHouseLandlord() {
        return houseLandlord;
    }

    public void setHouseLandlord(String houseLandlord) {
        this.houseLandlord = houseLandlord;
    }

    public String getHouseLandlordTelphone() {
        return houseLandlordTelphone;
    }

    public void setHouseLandlordTelphone(String houseLandlordTelphone) {
        this.houseLandlordTelphone = houseLandlordTelphone;
    }

    public Byte getHouseIsrent() {
        return houseIsrent;
    }

    public void setHouseIsrent(Byte houseIsrent) {
        this.houseIsrent = houseIsrent;
    }
}
