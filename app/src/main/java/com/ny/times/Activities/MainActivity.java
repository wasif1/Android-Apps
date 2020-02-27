package com.ny.times.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.ny.times.Adapters.ArticlesAdapter;
import com.ny.times.Interface.ArticleItemClickListener;
import com.ny.times.Interface.MainActivityInterface;
import com.ny.times.Models.NyTimesResponse;
import com.ny.times.Models.Result;
import com.ny.times.Presenters.MainActivityPresenter;
import com.ny.times.R;
import com.ny.times.Utills.Constants;

public class MainActivity extends AppCompatActivity implements MainActivityInterface, ArticleItemClickListener {

    private MainActivityPresenter presenter = null;
    private RecyclerView list_of_articles = null;
    private ArticlesAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setComponents();
    }

    private void setComponents() {
        presenter = new MainActivityPresenter(this, this);
        presenter.getNYTimesArticles(Constants.SECTION, Constants.PERIOD, Constants.API_KEY);
    }

    private void bindViews() {
        list_of_articles = findViewById(R.id.list_of_articles);
    }

    @Override
    public void success(NyTimesResponse response) {
        if (response != null) {
            adapter = new ArticlesAdapter(response.getResults(), this, this);
            list_of_articles.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false));
            list_of_articles.setAdapter(adapter);
        }
    }

    @Override
    public void failure(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void viewLoader(boolean show) {

    }

    @Override
    public void selectedItem(Result result) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(Constants.DATA, new Gson().toJson(result));
        startActivity(intent);
    }
}
