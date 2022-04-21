package com.example.whatdowant.Fragments;

import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import androidx.fragment.app.Fragment;


public class MyList extends Fragment {

    public static final String ARG_PARAM1 = "param1";
    public static final String ARG_PARAM2 = "param2";

    public String mParam1;
    public String mParam2;

    private OnFragmentInteractionListener mListener;

    public MyList() {

    }
        public static MyList newInstance(String param1, String param2) {
            MyList fragment = new MyList();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            fragment.setArguments(args);
            return fragment;

        }
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
            }
        }

    public interface OnFragmentInteractionListener {
    }
}
