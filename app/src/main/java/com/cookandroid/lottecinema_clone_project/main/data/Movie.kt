package com.cookandroid.lottecinema_clone_project.main.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id : Int,
    @SerializedName("title") val title : String,
    @SerializedName("overview") val overview : String,
    @SerializedName("poster_path") val poster_path : String,
    @SerializedName("backdrop_path") val backdrop_path : String,
    @SerializedName("popularity") val popularity : Float,
    @SerializedName("vote_average") val vote_average : Float,
    @SerializedName("release_date") val release_date : String
)
