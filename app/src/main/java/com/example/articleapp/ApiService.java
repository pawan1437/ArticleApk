package com.example.articleapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("load_article.php?latest=1&page=1&per_page=5")
    Call<List<Article>> getArticles();
}


