package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("1.0", "San Francisco", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("2.1", "London", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("3.2", "Tokyo", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("4.3", "Mexico City", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("5.4", "Moscow", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("6.5", "Rio de Janeiro", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("7.6", "Paris", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("1.0", "San Francisco", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("2.1", "London", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("3.2", "Tokyo", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("4.3", "Mexico City", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("5.4", "Moscow", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("6.5", "Rio de Janeiro", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("7.6", "Paris", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("1.0", "San Francisco", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("2.1", "London", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("3.2", "Tokyo", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("4.3", "Mexico City", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("5.4", "Moscow", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("6.5", "Rio de Janeiro", "Mar 10, 2016"));
        earthquakes.add(new Earthquake("7.6", "Paris", "Mar 10, 2016"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
