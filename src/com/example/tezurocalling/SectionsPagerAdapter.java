package com.example.tezurocalling;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.
    	final Fragment fragment;
        switch (position) {
        case 0:
        	fragment = new FragmentEins();
            break;
        case 1:
        	fragment = new FragmentEins();
            break;
        case 2:
        	fragment = new FragmentEins();
            break;
        default:
            	fragment = new FragmentEins();
        }
        
        Bundle args = new Bundle();
//        args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "EINS";
            case 1:
                return "ZWEI";
            case 2:
                return "DREI";
        }
        return null;
    }
}
