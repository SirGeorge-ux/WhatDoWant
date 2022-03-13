package com.example.whatdowant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

    public class Contactos extends Fragment {

        public static final String ARG_PARAM1 = "param1";
        public static final String ARG_PARAM2 = "param2";

        private String mParam1;
        private String mParam2;

        private OnFragmentInteractionListener mListener;

        public Contactos() {

        }
        public static com.example.whatdowant.Fragments.MyList newInstance(String param1, String param2) {
            com.example.whatdowant.Fragments.MyList fragment = new com.example.whatdowant.Fragments.MyList();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, parami1);
            args.putString(ARG_PARAM2, parami2);
            fragment.setArguments(args);
            return fragment;

        }
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.OnCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
            }
        }

        public interface OnFragmentInteractionListener {
        }
    }
