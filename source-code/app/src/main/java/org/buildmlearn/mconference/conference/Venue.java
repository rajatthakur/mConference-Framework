package org.buildmlearn.mconference.conference;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.buildmlearn.mconference.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class Venue extends Fragment {


    public Venue() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_venue, container, false);
    }

}