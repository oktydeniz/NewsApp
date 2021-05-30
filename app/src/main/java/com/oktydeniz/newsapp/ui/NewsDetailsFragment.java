package com.oktydeniz.newsapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.oktydeniz.newsapp.R;
import com.oktydeniz.newsapp.data.FakeDataSource;
import com.oktydeniz.newsapp.data.NewsItem;
import com.oktydeniz.newsapp.databinding.FragmentNewsDetailsBinding;


public class NewsDetailsFragment extends Fragment {
    public NewsDetailsFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentNewsDetailsBinding fragmentNewsDetailsBinding =
                DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_news_details, container, false);

        FakeDataSource fakeDataSource = new FakeDataSource();
        NewsItem item = fakeDataSource.generateRandomNewsItem();

        item.setFav(true);
        fragmentNewsDetailsBinding.setNewsItemData(item);

        return fragmentNewsDetailsBinding.getRoot();
    }
}