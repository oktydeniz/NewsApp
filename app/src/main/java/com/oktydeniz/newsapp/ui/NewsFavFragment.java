package com.oktydeniz.newsapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.oktydeniz.newsapp.R;
import com.oktydeniz.newsapp.data.FakeDataSource;
import com.oktydeniz.newsapp.ui.news.DiffUtilNewsItemCallback;
import com.oktydeniz.newsapp.ui.news.NewsListAdapter;


public class NewsFavFragment extends Fragment {


    public NewsFavFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news_fav, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initFavList(view);

    }

    private void initFavList(@NonNull View view) {
        RecyclerView rvFav = view.findViewById(R.id.rv_fav);
        rvFav.setLayoutManager(new GridLayoutManager(getContext(),2));
        rvFav.setHasFixedSize(true);
        NewsListAdapter adapter = new NewsListAdapter(new DiffUtilNewsItemCallback());
        rvFav.setAdapter(adapter);
        FakeDataSource fakeDataSource = new FakeDataSource();
        adapter.submitList(fakeDataSource.getFakeStaticListNews());
    }
}