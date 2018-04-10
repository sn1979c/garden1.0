package com.example.lenovo.garden.grid_with_tiles;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.garden.R;

import java.lang.ref.WeakReference;
import java.util.List;



public class GridWithTilesAdapter extends RecyclerView.Adapter<GridWithTilesDataViewHolder> {

    private List<GridWithTilesData> data;
    private WeakReference<Context> contextWeakReference;

    GridWithTilesAdapter(Context context, List<GridWithTilesData> data) {
        this.data = data;
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override
    public GridWithTilesDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(contextWeakReference.get()).inflate(
                R.layout.tile, parent, false);
        return new GridWithTilesDataViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(GridWithTilesDataViewHolder holder, int position) {
        holder.imageView.setImageResource(data.get(position).drawableRes);
        Palette palette =
                Palette.from(((BitmapDrawable) holder.imageView.getDrawable()).getBitmap())
                        .generate();
        int color = palette.getDarkVibrantColor(0);
        holder.contentPanel.setBackgroundColor(color);
        holder.setFavoriteState(data.get(position).favorite);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
