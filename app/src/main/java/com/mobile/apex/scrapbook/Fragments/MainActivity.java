package com.mobile.apex.scrapbook.Fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mobile.apex.scrapbook.R;
import com.mobile.apex.scrapbook.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements HolidayFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Fragment to be placed in the activity layout
        HolidayFragment firstFragment = new HolidayFragment();

        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        firstFragment.setArguments(getIntent().getExtras());

        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, firstFragment).commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item)
    {
        Toast.makeText(this, "You clicked " + item.toString(), Toast.LENGTH_LONG).show();
    }
}
