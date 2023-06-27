package com.yeeun.booksearchapp.data.api

import com.yeeun.booksearchapp.data.model.SearchResponse
import com.yeeun.booksearchapp.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookSearchApi {
    @Headers("Authorization: KakaoAK ${Constants.API_KEY}")
    @GET("v3/search/book")
    suspend fun searchBooks(
        @Query("query") query: String,
        @Query("sort") sort: String,
        @Query("page") page: Int,
        @Query("size") size: Int
    ): Response<SearchResponse>
}