package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DocumentoDao {

    @Insert
    public void inserirDoc(Documento documento);

}
