package com.razor.hidetoolbaronscrollsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.razor.hidetoolbaronscrollsample.R;
import com.razor.hidetoolbaronscrollsample.holder.RecyclerItemViewHolder;

import java.util.ArrayList;

/**
 * Created by razor on 4/8/15.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerItemViewHolder> {
    private ArrayList<String> mItemList;

    public RecyclerAdapter(ArrayList<String> itemList) {
        mItemList = itemList;
    }
    @Override
    public RecyclerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items, parent, false);
        return RecyclerItemViewHolder.newInstance(view);
    }

    @Override
    public void onBindViewHolder(RecyclerItemViewHolder holder, int position) {
        String itemText = mItemList.get(position);
        holder.setItemText(itemText);
    }

    @Override
    public int getItemCount() {
        return mItemList==null?0:mItemList.size();
    }
}
