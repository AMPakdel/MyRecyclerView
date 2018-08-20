package com.example.packdel.myrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Fragments.CallsFragment;
import Fragments.ContactsFragment;
import Fragments.FavsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PagerViewAdapter pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        pagerViewAdapter.addFragment(new CallsFragment(), "");
        pagerViewAdapter.addFragment(new ContactsFragment(), "");
        pagerViewAdapter.addFragment(new FavsFragment(), "");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(pagerViewAdapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black_24dp);

    }
}
