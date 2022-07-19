package com.example.hazard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Information {

    @SerializedName("hz_id")
    @Expose
    public String hzId;
    @SerializedName("hz_location")
    @Expose
    public String hzLocation;
    @SerializedName("hz_state")
    @Expose
    public String hzState;
    @SerializedName("hz_repname")
    @Expose
    public String hzRepname;
    @SerializedName("hz_type")
    @Expose
    public String hzType;
    @SerializedName("hz_desc")
    @Expose
    public String hzDesc;
    @SerializedName("hz_time")
    @Expose
    public String hzTime;
    @SerializedName("hz_date")
    @Expose
    public String hzDate;
    @SerializedName("hz_lat")
    @Expose
    public String hzLat;
    @SerializedName("hz_lng")
    @Expose
    public String hzLng;

}
