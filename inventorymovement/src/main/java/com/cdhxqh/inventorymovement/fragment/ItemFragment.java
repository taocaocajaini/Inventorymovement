package com.cdhxqh.inventorymovement.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cdhxqh.inventorymovement.R;

public class ItemFragment extends Fragment {
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container,
                false);
        textView = (TextView) view.findViewById(R.id.textView);

        String text = getArguments().getString("text");
        textView.setText(text);

        return view;
    }

}
