package com.oktydeniz.newsapp.ui.news;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.oktydeniz.newsapp.R;
import com.oktydeniz.newsapp.data.NewsItem;
import com.oktydeniz.newsapp.databinding.ItemNewsImageBinding;
import com.oktydeniz.newsapp.databinding.ItemNewsTextBinding;

public class NewsListAdapter extends ListAdapter<NewsItem,BaseViewHolder> {

    public static final int viewType_NEWS_IMAGE = 1;



    public NewsListAdapter(@NonNull DiffUtil.ItemCallback<NewsItem> diffCallback) {
        super(diffCallback);
    }



    @Override
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == viewType_NEWS_IMAGE) {
            ItemNewsImageBinding itemNewsImageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                    R.layout.item_news_image, parent, false);
            return new ImageViewHolder(itemNewsImageBinding);
        }
        ItemNewsTextBinding defaultItemNewsTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_news_text, parent, false);
        return new TextViewHolder(defaultItemNewsTextBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

        holder.bindData(getItem(position));

    }









}
