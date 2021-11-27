package com.example.retrofittutorial;

import com.example.retrofittutorial.data.remote.RetrofitClient;
import com.example.retrofittutorial.data.remote.SOService;

public class ApiUtils {
    public static final String Base_Url = "https://api.stackexchange.com/2.2";
    public static SOService soService() {
        return RetrofitClient.getClient(Base_Url).create(SOService.class);
    }
}
