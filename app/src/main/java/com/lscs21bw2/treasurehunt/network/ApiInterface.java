package com.lscs21bw2.treasurehunt.network;

import com.lscs21bw2.treasurehunt.model.Dash;
import com.lscs21bw2.treasurehunt.model.Direction;
import com.lscs21bw2.treasurehunt.model.Item;
import com.lscs21bw2.treasurehunt.model.Room;
import com.lscs21bw2.treasurehunt.model.SellItem;
import com.lscs21bw2.treasurehunt.model.SellResponse;
import com.lscs21bw2.treasurehunt.model.Status;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("api/adv/init/")
    Call<Room> initPlayer(@Header("Authorization") String token);

    @Headers("Content-Type: application/json")
    @POST("api/adv/move/")
    Call<Room> movePlayer(@Header("Authorization") String token);

    @Headers("Content-Type: application/json")
    @POST("api/adv/take/")
    Call<Room> pickupItem(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/drop/")
    Call<Room> dropItem(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/sell/")
    Call<SellResponse> sellItem(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/sell/")
    Call<Room> confirmSellItem(@Header("Authorization") String token, @Body SellItem sellItem);

    @Headers("Content-Type: application/json")
    @POST("api/adv/status/")
    Call<Status> status(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/examine/")
    Call<Status> examine(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/wear/")
    Call<Room> equipItem(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/change_name/")
    Call<Room> changeName(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/pray/")
    Call<Room> pray(@Header("Authorization") String token);

    @Headers("Content-Type: application/json")
    @POST("api/adv/fly/")
    Call<Room> flight(@Header("Authorization") String token, @Body Direction direction);

    @Headers("Content-Type: application/json")
    @POST("api/adv/dash/")
    Call<Room> dash(@Header("Authorization") String token, @Body Dash dash);

    @Headers("Content-Type: application/json")
    @POST("api/adv/carry/")
    Call<Room> ghostCarryItem(@Header("Authorization") String token, @Body Item item);

    @Headers("Content-Type: application/json")
    @POST("api/adv/receive/")
    Call<Room> ghostReturnItem(@Header("Authorization") String token);
}
