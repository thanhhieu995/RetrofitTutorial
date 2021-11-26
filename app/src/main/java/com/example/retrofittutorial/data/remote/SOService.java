package com.example.retrofittutorial.data.remote;

import com.example.retrofittutorial.data.model.SOAnswerReponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswerReponse>> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswerReponse>> getAnswers(@Query("tagged") String tags);
}
