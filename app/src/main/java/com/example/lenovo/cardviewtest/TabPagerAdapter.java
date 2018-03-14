package com.example.lenovo.cardviewtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lenovo.cardviewtest.big_card.BigCardsFragment;
import com.example.lenovo.cardviewtest.card_with_header.CardWithHeaderFragment;
import com.example.lenovo.cardviewtest.grid_with_tiles.GridWithTilesFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BigCardsFragment();
            case 1:
                return new CardWithHeaderFragment();
            case 2:
                return new GridWithTilesFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Big Cards";
            case 1:
                return "Cards With Header";
            case 2:
                return "Grid Tiles";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
