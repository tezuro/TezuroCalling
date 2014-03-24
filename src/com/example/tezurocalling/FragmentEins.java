package com.example.tezurocalling;

import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class FragmentEins extends Fragment{
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentEins() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_active_contacts, container, false);
        
        //@+id/TableLayoutActiveContacts
        TableLayout table = (TableLayout) rootView.findViewById(R.id.TableLayoutActiveContacts);
        
        // create a new TableRow
        TableRow row = new TableRow(table.getContext());
        
        
        
        row.setBackgroundColor(Color.BLACK);
        row.setPadding(0, 0, 0, 2); //Border between rows
        
        TableRow.LayoutParams params = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        row.setLayoutParams(params);
        
        
        TableRow.LayoutParams llp = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        llp.setMargins(0, 0, 2, 0);//2px right-margin
        
        
        LinearLayout cell = new LinearLayout(table.getContext());
        cell.setBackgroundColor(Color.WHITE);
        cell.setLayoutParams(llp);//2px border on the right for the cell
        
        TextView tv = new TextView(table.getContext());
        tv.setText("Mariana is in da house");
        tv.setPadding(0, 0, 4, 3);

        cell.addView(tv);
        
        LinearLayout cell2 = new LinearLayout(table.getContext());
        cell2.setBackgroundColor(Color.WHITE);
        cell2.setLayoutParams(llp);//2px border on the right for the cell
        
        TextView tv2 = new TextView(table.getContext());
        tv2.setText("Some Text2");
        tv2.setPadding(0, 0, 4, 3);

        cell2.addView(tv2);
        
        
        LinearLayout cell3 = new LinearLayout(table.getContext());
        cell3.setBackgroundColor(Color.WHITE);
        cell3.setLayoutParams(llp);//2px border on the right for the cell
        
        TextView tv3 = new TextView(table.getContext());
        tv3.setText("Some Text3");
        tv3.setPadding(0, 0, 4, 3);

        cell3.addView(tv3);
        //add as many cells you want to a row, using the same approach

        row.addView(cell);
        row.addView(cell2);
        row.addView(cell3);

        // add the TableRow to the TableLayout
        //table.addView(row);
        table.addView(row, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        
        
        
        //dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}
