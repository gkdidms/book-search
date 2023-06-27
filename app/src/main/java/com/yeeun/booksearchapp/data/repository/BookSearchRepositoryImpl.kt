package com.yeeun.booksearchapp.data.repository

import com.yeeun.booksearchapp.data.api.RetrofitInterface
import com.yeeun.booksearchapp.data.model.SearchResponse
import retrofit2.Response

class BookSearchRepositoryImpl : BookSearchRepository {
    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return RetrofitInterface.api.searchBooks(query, sort, page, size)
    }
}