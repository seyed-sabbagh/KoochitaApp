package com.example.koochita.taghvim_kasbOkar2.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.koochita.R;
import com.example.koochita.fragment_taghvim_kasb_o_kar.fragment1_taghvimKasOkar;
import com.example.koochita.fragment_taghvim_kasb_o_kar.fragment2_TaghvimKasbOkar;
import com.example.koochita.taghvim_kasbOkar2.fragment1_taghvimKasOkar2;
import com.example.koochita.taghvim_kasbOkar2.fragment2_taghvimKasOkar2;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new fragment1_taghvimKasOkar2();
                break;
            case 1:
                fragment = new fragment2_taghvimKasOkar2();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}