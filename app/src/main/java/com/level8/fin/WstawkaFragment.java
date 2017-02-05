package com.level8.fin;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WstawkaFragment extends Fragment {

     public WstawkaFragment(){

     }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        JajkoFragment jf=new JajkoFragment();
        FragmentTransaction ft=getChildFragmentManager().beginTransaction();
        ft.replace(R.id.jajko_container, jf);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

        return inflater.inflate(R.layout.fragment_wstawka, container, false);
    }

}
