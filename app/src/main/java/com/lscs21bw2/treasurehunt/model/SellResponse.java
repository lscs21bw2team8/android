package com.lscs21bw2.treasurehunt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SellResponse {
    @SerializedName("room_id")
    @Expose
    private String roomId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("coordinates")
    @Expose
    private String coordinates;
    @SerializedName("players")
    @Expose
    private List<Object> players = null;
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
    private List<String> messages = null;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
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

    public List<Object> getPlayers() {
        return players;
    }

    public void setPlayers(List<Object> players) {
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

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
