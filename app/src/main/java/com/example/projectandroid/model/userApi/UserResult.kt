
package com.example.projectandroid.model.userApi

import com.google.gson.annotations.SerializedName

data class UserResult (

    @SerializedName("results") val results : List<Users>,
    @SerializedName("info") val info : Info
)