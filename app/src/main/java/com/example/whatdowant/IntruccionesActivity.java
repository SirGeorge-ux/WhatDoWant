package com.example.whatdowant;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.whatdowant.Fragments.Contactos;
import com.example.whatdowant.Fragments.Lists;
import com.example.whatdowant.Fragments.MyList;
import com.example.whatdowant.ui.main.SectionsPagerAdapter;


public class IntruccionesActivity extends AppCompatActivity implements MyList.OnFragmentInteractionListener,
        Lists.OnFragmentInteractionListener, Contactos.OnFragmentInteractionListener {

    ViewPager viewPager;
    private LinearLayout linearPuntos;
    private TextView[] puntosSlide;
    private Html Htlm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrucciones);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        linearPuntos = findViewById(R.id.idLinearPuntos);
        agregarIndicadorPuntos(pos:0);
        viewPager.addOnPageChangeListener(viewListener);
    }
        /*
        binding = ActivityIntruccionesBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;
        */


    private void agregarIndicadorPuntos(int pos) {
            puntosSlide = new TextView[3];
            linearPuntos.removeAllViews();

            for (int i = 0; i < puntosSlide.length; i++) {
                puntosSlide[i] = new TextView(this);
                puntosSlide[i].setText(Htlm.fromHtml("&#8226;"));
                puntosSlide[i].setTextSize(45);
                puntosSlide[i].setTextColor(getResources().getColor(R.color.blancoTransparente));
                linearPuntos.addView(puntosSlide[i]);
            }
            if (puntosSlide.length > 0) {
                puntosSlide[pos].setTextColor(getResources().getColor(R.color.white));
            }
        }

        ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int pos) {
                agregartIndicadorPuntos(pos);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };

    private void agregartIndicadorPuntos(int pos) {
    }

    private void agregarIndicadorPuntos(int i) {
    }

}
