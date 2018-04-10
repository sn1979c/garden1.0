package com.example.lenovo.garden.big_card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.garden.R;

import java.lang.ref.WeakReference;
import java.util.List;



public class BigCardsAdapter extends RecyclerView.Adapter<BigCardDataViewHolder> {

    private List<BigCardData> data;
    private WeakReference<Context> contextWeakReference;

    BigCardsAdapter(Context context, List<BigCardData> data) {
        this.data = data;
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override
    public BigCardDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(contextWeakReference.get()).inflate(
                R.layout.card_big, parent, false);
        return new BigCardDataViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(BigCardDataViewHolder holder, int position) {
        holder.bigImageView.setImageResource(data.get(position).drawableRes);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
