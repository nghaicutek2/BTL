package com.example.onbroading;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OnBroadingFragment1();
            case 1:
                return new OnBroadingFragment2();
            case 2:
                return new OnBroadingFragment3();
            default:
                return new OnBroadingFragment1();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
