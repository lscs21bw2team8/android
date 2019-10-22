package com.lscs21bw2.treasurehunt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Status {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cooldown")
    @Expose
    private Double cooldown;
    @SerializedName("encumbrance")
    @Expose
    private Integer encumbrance;
    @SerializedName("strength")
    @Expose
    private Integer strength;
    @SerializedName("speed")
    @Expose
    private Integer speed;
    @SerializedName("gold")
    @Expose
    private Integer gold;
    @SerializedName("inventory")
    @Expose
    private List<String> inventory = null;
    @SerializedName("status")
    @Expose
    private List<Object> status = null;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("messages")
    @Expose
    private List<Object> messages = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCooldown() {
        return cooldown;
    }

    public void setCooldown(Double cooldown) {
        this.cooldown = cooldown;
    }

    public Integer getEncumbrance() {
        return encumbrance;
    }

    public void setEncumbrance(Integer encumbrance) {
        this.encumbrance = encumbrance;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public List<Object> getStatus() {
        return status;
    }

    public void setStatus(List<Object> status) {
        this.status = status;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }
}
