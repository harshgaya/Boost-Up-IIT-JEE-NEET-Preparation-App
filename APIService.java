package com.harsh.jeephysics.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAOom8_68:APA91bH432A8zvJYGsz_duR4LBEddV0oaqXenHwroF_CgAwBMmn6plUhR-1bwlK7ABcu7PXBsVmeSoWKUSWZ_fa9NTP3ktuSV9sUAzeR_4p3mz6vwwKPda0vvnNXq6CO4rxH73UDhcrD"

    })
    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);

}
