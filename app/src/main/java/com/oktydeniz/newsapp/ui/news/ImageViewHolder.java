package com.oktydeniz.newsapp.ui.news;

import androidx.annotation.NonNull;

import com.oktydeniz.newsapp.data.NewsItem;
import com.oktydeniz.newsapp.databinding.ItemNewsImageBinding;

public class ImageViewHolder extends BaseViewHolder {

    ItemNewsImageBinding itemNewsImageBinding;

    public ImageViewHolder(@NonNull ItemNewsImageBinding itemNewsImageBinding) {
        super(itemNewsImageBinding.getRoot());
        this.itemNewsImageBinding = itemNewsImageBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsImageBinding.setNewsItemImage(item);

    }

}
