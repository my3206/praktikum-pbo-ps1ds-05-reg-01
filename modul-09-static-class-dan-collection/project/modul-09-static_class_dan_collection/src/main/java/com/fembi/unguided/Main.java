package com.fembi.unguided;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<HasilEksperimen> daftar = new ArrayList<>();

        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // Jumlah eksperimen
        System.out.println("Jumlah eksperimen: "
                + HasilEksperimen.getJumlahEksperimen());

        // Sorting berdasarkan akurasi
        Collections.sort(daftar);

        System.out.println("\nSorted by akurasi");
        daftar.forEach(System.out::println);

        // Sorting berdasarkan waktu training
        daftar.sort(new WaktuComparator());

        System.out.println("\nSorted by waktu training");
        daftar.forEach(System.out::println);

        // Filtering akurasi minimal 0.85
        System.out.println("\nModel dengan akurasi minimal 0.85");

        daftar.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .forEach(System.out::println);

        // Pencarian model KNN
        System.out.println("\nPencarian model KNN");

        HasilEksperimen hasil = daftar.stream()
                .filter(e -> e.getNama().equals("KNN"))
                .findFirst()
                .orElse(null);

        System.out.println(hasil);
    }
}