package com.example.lenovo.garden;

import android.content.Context;
import android.util.AttributeSet;

public class SixteenNineImageView extends android.support.v7.widget.AppCompatImageView{

    public SixteenNineImageView(Context context) {
        super(context);
    }

    public SixteenNineImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SixteenNineImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int height = getMeasuredWidth() / 16 * 9;
        setMeasuredDimension(getMeasuredWidth(), height);
    }
}