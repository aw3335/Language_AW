package com.hfad.language_aw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InitialFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_initial, container, false);

        Button btnEnglish = view.findViewById(R.id.btnEnglish);
        Button btnSpanish = view.findViewById(R.id.btnSpanish);
        Button btnGerman = view.findViewById(R.id.btnGerman);

        btnEnglish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_englishFragment)
        );

        btnSpanish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_spanishFragment)
        );

        btnGerman.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_germanFragment)
        );

        return view;
    }
}