package com.example.whatdowant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class Lists extends Fragment {

        public static final String ARG_PARAM1 = "param1";
        public static final String ARG_PARAM2 = "param2";

        private String mParam1;
        private String mParam2;

        private OnFragmentInteractionListener mListener;

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