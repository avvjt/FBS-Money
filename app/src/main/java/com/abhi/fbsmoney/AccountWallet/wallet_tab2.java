package com.abhi.fbsmoney.AccountWallet;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhi.fbsmoney.R;

public class wallet_tab2 extends Fragment {

    SearchView searchView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wallet_tab2, container, false);

        searchView = view.findViewById(R.id.search_bar);
        searchView.setIconified(false);
        return view;
    }
}