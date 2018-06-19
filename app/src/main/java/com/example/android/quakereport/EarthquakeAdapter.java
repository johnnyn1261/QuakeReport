package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

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

        TextView magnitudeTextView = (TextView)listViewItem.findViewById(R.id.magnitude_textview);
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        TextView locationTextView = (TextView)listViewItem.findViewById(R.id.location_textview);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView dateTextView = (TextView)listViewItem.findViewById(R.id.date_textview);
        dateTextView.setText(currentEarthquake.getDate());

        return listViewItem;
    }
}
