package com.example.projectandroid.network;

import java.io.IOException;

import retrofit2.Response;

/**
 * Class to receive the error as response (Callback)
 * Get .code() & .erroBody() and set code and message with it
 * Created by Nicolas Churlet on 13/04/2018.
 */

public class ApiError {
    public String code;
    public String message;

    public ApiError(Response response) {
        this.code = String.valueOf(response.code());
        try {
            this.message = response.errorBody().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ApiError(Throwable throwable) {
        this.code = "EXC";
        this.message = throwable.getMessage();
    }
}
