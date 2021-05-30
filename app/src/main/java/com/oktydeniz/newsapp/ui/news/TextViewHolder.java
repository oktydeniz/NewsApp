package com.oktydeniz.newsapp.ui.news;
import androidx.annotation.NonNull;

import com.oktydeniz.newsapp.data.NewsItem;
import com.oktydeniz.newsapp.databinding.ItemNewsTextBinding;

public class TextViewHolder extends BaseViewHolder {

    ItemNewsTextBinding itemNewsTextBinding;

    public TextViewHolder(@NonNull ItemNewsTextBinding itemNewsTextBinding) {
        super(itemNewsTextBinding.getRoot());
        this.itemNewsTextBinding = itemNewsTextBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsTextBinding.setNewsItemText(item);

    }

}
