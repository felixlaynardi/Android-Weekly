package umn.ac.week11_28641.Rest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import umn.ac.week11_28641.Model.PostModel;

public interface Helper {
    @GET("posts")
    Call<List<PostModel>> getModels();
}
