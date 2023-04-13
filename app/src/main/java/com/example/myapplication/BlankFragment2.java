package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentBlank2Binding;

public class BlankFragment2 extends Fragment {

    FragmentBlank2Binding binding;
    BancoDeDados db;

    public BlankFragment2 (){
        super(R.layout.fragment_blank);
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        binding = FragmentBlank2Binding .inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.salvarDocumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = Room.databaseBuilder(getContext() , BancoDeDados.class, "docs2").allowMainThreadQueries().build();
                DocumentoDao documentoDao = db.documentoDao();

                String titulo = binding.titulo.getText().toString();
                String texto = binding.texto.getText().toString();

                Documento documento = new Documento(0, titulo, texto);

                binding.titulo.setText("");
                binding.texto.setText("");

                documentoDao.inserirDoc(documento);

            }
        });

        binding.apagarDocumento.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment, null));

    }
}