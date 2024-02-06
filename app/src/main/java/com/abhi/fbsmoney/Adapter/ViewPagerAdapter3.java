package com.abhi.fbsmoney.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.abhi.fbsmoney.Beneficent.BeneficentTab1;
import com.abhi.fbsmoney.Beneficent.BeneficentTab2;

public class ViewPagerAdapter3 extends FragmentStateAdapter {
    public ViewPagerAdapter3(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new BeneficentTab1();
            case 1: return new BeneficentTab2();
            default:return new BeneficentTab1();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
