package com.abhi.fbsmoney.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.abhi.fbsmoney.AccountWallet.wallet_tab1;
import com.abhi.fbsmoney.AccountWallet.wallet_tab2;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new wallet_tab1();
            case 1: return new wallet_tab2();
            default:return new wallet_tab1();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
