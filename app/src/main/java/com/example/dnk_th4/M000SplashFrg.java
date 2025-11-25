package com.example.dnk_th4;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class M000SplashFrg extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initViews();

        return inflater.inflate(R.layout.m000_frg_splash, container, false);
    }

    private void initViews() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoM001Screen();
            }
        }, 2000);
    }

    private void gotoM001Screen() {
        ((MainActivity) getActivity()).gotoM001Screen();
    }
}
