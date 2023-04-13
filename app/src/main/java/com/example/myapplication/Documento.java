package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Documento {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "titulo")
    private String titulo;

    @ColumnInfo(name = "descricao")
    private String texto;

    public Documento(int id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
