package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.databinding.FragmentBlankBinding;

import java.util.List;

public class BlankFragment extends Fragment {

    FragmentBlankBinding binding;
    BancoDeDados db;

    public BlankFragment (){
        super(R.layout.fragment_blank);
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.criarNovo.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment2, null));
        db = Room.databaseBuilder(getContext() , BancoDeDados.class, "docs2").allowMainThreadQueries().build();

        DocumentoDao documentoDao = db.documentoDao();

    }
}