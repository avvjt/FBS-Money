package com.abhi.fbsmoney.AccountWallet;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.abhi.fbsmoney.R;
import com.abhi.fbsmoney.SendMoney.EnterAmount;

public class wallet_tab1 extends Fragment {

    AppCompatButton withdraw;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_wallet_tab1, container, false);

        AppCompatButton withdraw = view.findViewById(R.id.withdraw);
        AppCompatButton fund_wallet = view.findViewById(R.id.fund_wallet);


        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(getActivity(), withdraw.class);

                // You can also pass data to the new activity using putExtra if needed
                // intent.putExtra("key", "value");

                // Start the new activity
                startActivity(intent);
            }
        });

        fund_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FundsAdd.class);

                // You can also pass data to the new activity using putExtra if needed
                // intent.putExtra("key", "value");

                // Start the new activity
                startActivity(intent);
            }
        });

        return view;
    }

}