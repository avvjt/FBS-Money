package com.abhi.fbsmoney.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.abhi.fbsmoney.Beneficent.BeneficentTab1;
import com.abhi.fbsmoney.Beneficent.BeneficentTab2;
import com.abhi.fbsmoney.Transaction.TransactionTab1;
import com.abhi.fbsmoney.Transaction.TransactionTab2;

public class ViewPagerAdapter4 extends FragmentStateAdapter {
    public ViewPagerAdapter4(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new TransactionTab1();
            case 1: return new TransactionTab2();
            default:return new TransactionTab1();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
