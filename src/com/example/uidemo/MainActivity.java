package com.example.uidemo;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toolbar;

public class MainActivity extends FragmentActivity {
	
	private Toolbar mToolbar;
	
	private SlidingTabLayout mSlidingTab;
	
	private ViewPager mViewPager;
	
	private ArrayList<Fragment> mFragments;
	
	private ViewPagerAdapter mAdapter;

	private OnClickListener mNavigationListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(mToolbar);
        
        String nickName = "Li Yikun";
        String introduce= "fall in love with Microsoft OneNote";
        
        getActionBar().setTitle(nickName);
        mToolbar.setSubtitle(introduce);
        mToolbar.setNavigationIcon(R.drawable.cat);
        mToolbar.setNavigationOnClickListener(mNavigationListener);
        
        mSlidingTab = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        
        mFragments = new ArrayList<Fragment>();
        mFragments.add(new FragmentTab1());
        mFragments.add(new FragmentTab2());
        mFragments.add(new FragmentTab3());
       
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setOffscreenPageLimit(mFragments.size());
        mViewPager.setAdapter(mAdapter);
        
        mSlidingTab.setViewPager(mViewPager);
    }
}
