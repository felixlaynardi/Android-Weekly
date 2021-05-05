package umn.ac.week11_28641;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import umn.ac.week11_28641.Adapter.PostAdapter;
import umn.ac.week11_28641.Model.PostModel;
import umn.ac.week11_28641.Rest.ApiClient;
import umn.ac.week11_28641.Rest.Helper;

public class MainActivity extends AppCompatActivity {
    Helper helper;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    List<PostModel> ModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        helper = ApiClient.getClient().create(Helper.class);

        start();
    }

    public void start(){
        Call<List<PostModel>> modelCall = helper.getModels();
        modelCall.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                ModelList = response.body();
                Log.d("onResponse", "Jumlah data Kontak: " + String.valueOf(ModelList.size()));

                mAdapter = new PostAdapter(ModelList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}