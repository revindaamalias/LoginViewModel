package com.example.viewmodellogin.models;

public class MahasiswaModel {
    public int NIM;
    public String nama;
    public int semester;

    public MahasiswaModel(int NIM, String nama, int semester){
        this.NIM = NIM;
        this.nama = nama;
        this.semester = semester;
    }

    public MahasiswaModel() {

    }

    public int getNIM() { return NIM; }

    public void setNIM( int NIM ) { this.NIM = NIM; }

    public String getNama() { return nama; }

    public void setNama( String nama ) { this.nama = nama; }

    public int getSemester() { return semester; }

    public void setSemester( int semester ) { this.semester = semester; }
}