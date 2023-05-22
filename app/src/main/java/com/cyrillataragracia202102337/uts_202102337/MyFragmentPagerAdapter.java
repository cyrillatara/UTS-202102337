package com.cyrillataragracia202102337.uts_202102337;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private ResmiFragment _resmiFragment = new ResmiFragment();
    private Context _context;
    private  int _tabCount;
    private InternalFragment _internalFragment = new InternalFragment();


    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
    super(fragmentManager);
    _context = context;
    _tabCount = tabCount;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return _internalFragment;
            default:
                return _resmiFragment;
        }
    }

    @Override
    public int getCount()
    {
        return _tabCount;
    }
}
