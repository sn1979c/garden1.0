package com.example.lenovo.garden.card_with_header;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.garden.R;

import java.util.ArrayList;
import java.util.List;




public class CardWithHeaderFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)
                inflater.inflate(R.layout.fragment_cards_with_header, container, false);
        setupUI(rootView);
        return rootView;
    }

    private void setupUI(ViewGroup rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new CardWithHeaderAdapter(getActivity(), createFakeData()));
    }

    private List<CardWithHeaderData> createFakeData() {
        List<CardWithHeaderData> data = new ArrayList<>();
        data.add(new CardWithHeaderData(R.drawable.b));
        data.add(new CardWithHeaderData(R.drawable.d));
        data.add(new CardWithHeaderData(R.drawable.a));
        data.add(new CardWithHeaderData(R.drawable.d));
        return data;
    }
}
