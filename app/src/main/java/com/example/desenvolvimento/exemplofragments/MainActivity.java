package com.example.desenvolvimento.exemplofragments;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vpContainer);
        gerenciaViewPager(viewPager);
    }

    private void gerenciaViewPager(ViewPager viewPager) {
        SecaoStatePagerAdapter adapter = new SecaoStatePagerAdapter(getSupportFragmentManager());
        adapter.adcionaFragment(new Fragment01(), "Fragment01");
        adapter.adcionaFragment(new Fragment02(), "Fragment02");
        adapter.adcionaFragment(new Fragment03(), "Fragment03");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int numeroDoFragment) {
        viewPager.setCurrentItem(numeroDoFragment);
    }
}
