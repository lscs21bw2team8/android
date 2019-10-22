package com.lscs21bw2.treasurehunt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Room {

    @SerializedName("room_id")
    @Expose
    private Integer roomId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("coordinates")
    @Expose
    private String coordinates;
    @SerializedName("elevation")
    @Expose
    private Integer elevation;
    @SerializedName("terrain")
    @Expose
    private String terrain;
    @SerializedName("players")
    @Expose
    private List<String> players = null;
    @SerializedName("items")
    @Expose
    private List<Object> items = null;
    @SerializedName("exits")
    @Expose
    private List<String> exits = null;
    @SerializedName("cooldown")
    @Expose
    private Double cooldown;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("messages")
    @Expose
    private List<Object> messages = null;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public List<String> getExits() {
        return exits;
    }

    public void setExits(List<String> exits) {
        this.exits = exits;
    }

    public Double getCooldown() {
        return cooldown;
    }

    public void setCooldown(Double cooldown) {
        this.cooldown = cooldown;
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
