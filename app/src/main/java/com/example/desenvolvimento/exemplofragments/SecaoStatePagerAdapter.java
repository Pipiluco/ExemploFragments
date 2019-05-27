package com.example.desenvolvimento.exemplofragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class SecaoStatePagerAdapter extends FragmentStatePagerAdapter {
    private final List<String> titulos = new ArrayList<>();
    private final List<Fragment> fragments = new ArrayList<>();

    public SecaoStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void adcionaFragment(Fragment fragment, String titulo) {
        fragments.add(fragment);
        titulos.add(titulo);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
