package com.abhi.fbsmoney.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.abhi.fbsmoney.AccountWallet.Balance_tab1;
import com.abhi.fbsmoney.AccountWallet.Balance_tab2;

public class ViewPagerAdapter2 extends FragmentStateAdapter {
    public ViewPagerAdapter2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new Balance_tab1();
            case 1: return new Balance_tab2();
            default:return new Balance_tab1();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
