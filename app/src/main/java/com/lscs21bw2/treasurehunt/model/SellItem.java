package com.lscs21bw2.treasurehunt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellItem {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("confirm")
    @Expose
    private String confirm;

    public SellItem(String name, String confirm) {
        this.name = name;
        this.confirm = confirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
}
