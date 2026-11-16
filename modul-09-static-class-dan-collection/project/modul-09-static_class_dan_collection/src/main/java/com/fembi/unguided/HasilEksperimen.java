package com.fembi.unguided;

public class HasilEksperimen implements Comparable<HasilEksperimen> {
    private String nama;
    private double akurasi;
    private int waktu;

    private static int jumlahEksperimen = 0;

    public HasilEksperimen(String nama, double akurasi, int waktu) {
        this.nama = nama;
        this.akurasi = akurasi;
        this.waktu = waktu;
        jumlahEksperimen++;
    }

    public String getNama() {
        return nama;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktu() {
        return waktu;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public String toString() {
        return "Model=" + nama + ", akurasi=" + akurasi
                + ", waktu=" + waktu + " detik";
    }

    @Override
    public int compareTo(HasilEksperimen e) {
        return Double.compare(e.akurasi, this.akurasi);
    }
}