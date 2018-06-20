package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);
        String fullLocation = currentEarthquake.getLocation();
        String actualLocation;
        String locationOffset;


        if (fullLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = fullLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            actualLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            actualLocation = fullLocation;
        }

        TextView magnitudeTextView = (TextView)listViewItem.findViewById(R.id.magnitude_textview);
        magnitudeTextView.setText(currentEarthquake.getMagnitude() + "");

        TextView locationTextView = (TextView)listViewItem.findViewById(R.id.location_textview);
        locationTextView.setText(actualLocation);

        TextView locOffsetTextView = (TextView)listViewItem.findViewById(R.id.loc_offset_textview);
        locOffsetTextView.setText(locationOffset);

        TextView dateTextView = (TextView)listViewItem.findViewById(R.id.date_textview);
        dateTextView.setText(formatDate(currentEarthquake.getDate()) + "");

        TextView timeTextView = (TextView)listViewItem.findViewById(R.id.time_textview);
        timeTextView.setText(formatTime(currentEarthquake.getDate()) + "");

        return listViewItem;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
