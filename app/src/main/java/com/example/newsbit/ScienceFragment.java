package com.example.newsbit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScienceFragment extends Fragment {
    String api="1986db20cc1b4dd583ac779156575885";
    ArrayList<ModelClass>modelClassArrayList;
    Adapter adapter;
    String country="us";
    private RecyclerView recyclerViewofscience;
    private String category="science";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View v=inflater.inflate(R.layout.sciencefragment,null);
        recyclerViewofscience=v.findViewById(R.id.recyclerviewofscience);
        modelClassArrayList=new ArrayList<>();
        recyclerViewofscience.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClassArrayList);
        recyclerViewofscience.setAdapter(adapter);

        findNews();

        return v;
    }

    private void findNews() {

        String category = "science";
        ApiUtilities.getApiInterface().getCategoryNews(country, category,100,api).enqueue(new Callback<MainNews>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(@NonNull Call<MainNews> call, @NonNull Response<MainNews> response) {
                if(response.isSuccessful())
                {
                    assert response.body() != null;
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onFailure(@NonNull Call<MainNews> call, @NonNull Throwable t) {

            }
        });
        }
    }
