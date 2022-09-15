package com.example.socialmediaapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.socialmediaapp.Fragments.Notification2Fragment;
import com.example.socialmediaapp.Fragments.RequestFragment;

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Notification2Fragment();
            case 1: return new RequestFragment();
            default: return new Notification2Fragment();

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0){
            title = "NOTIFICATION";
        }else if (position == 1){
            title = "REQUEST";
        }

        return title;
    }
}
