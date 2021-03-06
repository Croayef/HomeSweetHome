package com.pogo.homesweethome;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;



public class Main2Activity extends AppCompatActivity implements FragmentHome.OnFragmentInteractionListener, FragmentGarage.OnFragmentInteractionListener, FragmentGarden.OnFragmentInteractionListener{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }


        //TUTAJ JEST CONTENT!

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);

            return rootView;
        }
    }

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
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0:
                    return FragmentHome.newInstance("s1","s2");
                case 1:
                    return FragmentGarden.newInstance("s1","s2");
                case 2:
                    return FragmentGarage.newInstance("s1","s2");
            }

            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "HOME";
                case 1:
                    return "GARDEN";
                case 2:
                    return "GARAGE";
            }
            return null;
        }
    }


    public void onHomeButton1Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton1.class);
        Main2Activity.this.startActivity(i);
    }

    public void onHomeButton2Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton2.class);
        Main2Activity.this.startActivity(i);
    }

    public void onHomeButton3Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton3.class);
        Main2Activity.this.startActivity(i);
    }

    public void onHomeButton4Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton4.class);
        Main2Activity.this.startActivity(i);
    }

    public void onHomeButton5Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton5.class);
        Main2Activity.this.startActivity(i);
    }

    public void onHomeButton6Click(View view){
        Intent i = new Intent(Main2Activity.this, HomeButton6.class);
        Main2Activity.this.startActivity(i);
    }

    public void onGardenButton1Click(View view){
        Intent i = new Intent(Main2Activity.this, GardenButton1.class);
        Main2Activity.this.startActivity(i);
    }

    public void onGardenButton2Click(View view){
        Intent i = new Intent(Main2Activity.this, GardenButton2.class);
        Main2Activity.this.startActivity(i);
    }

    public void onGardenButton3Click(View view){
        Intent i = new Intent(Main2Activity.this, GardenButton3.class);
        Main2Activity.this.startActivity(i);
    }

    public void onGardenButton4Click(View view){
        Intent i = new Intent(Main2Activity.this, GardenButton4.class);
        Main2Activity.this.startActivity(i);
    }


    public void onGarageButton1Click(View view){
        Intent i = new Intent(Main2Activity.this, GarageButton1.class);
        Main2Activity.this.startActivity(i);
    }

    public void onGarageButton2Click(View view){
        Intent i = new Intent(Main2Activity.this, GarageButton2.class);
        Main2Activity.this.startActivity(i);
    }


}
