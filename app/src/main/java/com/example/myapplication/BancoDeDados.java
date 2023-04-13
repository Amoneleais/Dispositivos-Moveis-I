package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(version = 1, entities = {Documento.class}, exportSchema = true)
public abstract class BancoDeDados extends RoomDatabase {

    public abstract DocumentoDao documentoDao();

}
