package com.allandroidprojects.ecomsample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;

public class CustomShopFragment extends Fragment {

    RadioGroup pages_size, pages_quality, pages_type, pages_color, cover_type, cover_texture, extras_bookmark, extras_charm;
    EditText number_of_pages, personalised_name;
    Button addToCart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View rootview = inflater.inflate(R.layout.main_activity, parent, false);



        return rootview;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {


        pages_size = view.findViewById(R.id.pagesize);
        pages_quality = view.findViewById(R.id.page_quality);
        pages_type = view.findViewById(R.id.page_type);
        pages_color = view.findViewById(R.id.page_color);
        cover_type = view.findViewById(R.id.page_cover_type);
        cover_texture = view.findViewById(R.id.page_cover_texture);
        extras_bookmark = view.findViewById(R.id.page_extras);
        extras_charm = view.findViewById(R.id.page_charm);


        view.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb;
                rb = view.findViewById(pages_size.getCheckedRadioButtonId());
                String pageSize = rb.getText().toString();
//                String pageQuality
            }
        });

    }


}
