package com.example.suitmedia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Guest {

    @SerializedName("id")
    @Expose
    public Integer idQuest;
    @SerializedName("nama")
    @Expose
    public String nama;
    @SerializedName("birthday")
    @Expose
    public String birthday;
}
