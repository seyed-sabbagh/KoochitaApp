package com.example.koochita.fragmentListKasOkar.ui.main;

import android.content.Context;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.koochita.R;
import com.example.koochita.fragmentListKasOkar.Fragment.fragment1_ListKasbOkar;
import com.example.koochita.fragmentListKasOkar.Fragment.fragment2_ListKasbOkar;
import com.example.koochita.fragmentListKasOkar.Fragment.fragment3_ListKasbOkar;
import com.example.koochita.fragmentListKasOkar.Fragment.fragment4_ListKasbOkar;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {



    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_emroz, R.string.tab_farda, R.string.tab_pas_farda, R.string.tab_tarikh_bar_asas_taghvim};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new fragment1_ListKasbOkar();
                break;
            case 1:
                fragment = new fragment2_ListKasbOkar();
                break;
            case 2:
                fragment = new fragment3_ListKasbOkar();
                break;
            case 3:
                fragment = new fragment4_ListKasbOkar();
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
        return 4;
    }

}
