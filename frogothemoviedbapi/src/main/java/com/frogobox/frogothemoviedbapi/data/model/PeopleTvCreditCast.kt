package com.frogobox.frogothemoviedbapi.data.model

data class PeopleTvCreditCast(
    val backdrop_path: String?,
    val character: String?,
    val credit_id: String?,
    val episode_count: Int?,
    val first_air_date: String?,
    val genre_ids: List<Int>?,
    val id: Int?,
    val name: String?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)