package com.lscs21bw2.treasurehunt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dash {
    @SerializedName("direction")
    @Expose
    private String direction;

    @SerializedName("num_rooms")
    @Expose
    private String num_rooms;

    @SerializedName("next_room_ids")
    @Expose
    private String next_room_ids;

    public Dash(String direction, String num_rooms, String next_room_ids) {
        this.direction = direction;
        this.num_rooms = num_rooms;
        this.next_room_ids = next_room_ids;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNum_rooms() {
        return num_rooms;
    }

    public void setNum_rooms(String num_rooms) {
        this.num_rooms = num_rooms;
    }

    public String getNext_room_ids() {
        return next_room_ids;
    }

    public void setNext_room_ids(String next_room_ids) {
        this.next_room_ids = next_room_ids;
    }
}
