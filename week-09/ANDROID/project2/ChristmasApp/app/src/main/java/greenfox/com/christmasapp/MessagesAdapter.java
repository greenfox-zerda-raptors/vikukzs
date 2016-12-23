package greenfox.com.christmasapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zsuzska on 2016. 12. 23..
 */

public class MessagesAdapter extends ArrayAdapter<Message> {
    public MessagesAdapter(Context context, ArrayList<Message> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Message message = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);
        }
        // Lookup view for data population
        TextView nameTW = (TextView) convertView.findViewById(R.id.name);
        TextView messageTV = (TextView) convertView.findViewById(R.id.message);
        TextView dateTW = (TextView) convertView.findViewById(R.id.time);
        // Populate the data into the template view using the data object
        nameTW.setText(message.username);
        messageTV.setText(message.body);
        dateTW.setText(message.time.toString());

        // Return the completed view to render on screen
        return convertView;
    }
}