package com.example.anilreddy.advancedandroid.trending;

import android.support.v7.util.DiffUtil;

import com.example.anilreddy.advancedandroid.model.Repo;

import java.util.List;

public class RepoDiffCallback extends DiffUtil.Callback {

    private List<Repo> oldList;
    private List<Repo> newList;

    RepoDiffCallback(List<Repo> oldList, List<Repo> newList) {
        this.newList = newList;
        this.oldList = oldList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).id() == newList.get(newItemPosition).id();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }
}
