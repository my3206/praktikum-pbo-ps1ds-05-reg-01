package com.fembi.guided.Collection.Iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIteration {
    public static void main(String[] args) {
        List<String> listBuah = new ArrayList<>();

        listBuah.add("Apel");
        listBuah.add("Mangga");
        listBuah.add("Jeruk");
        listBuah.add("Pisang");

        System.out.println("Total elemen: " + listBuah.size());
        System.out.println("Apakah ada 'Mangga'? " + listBuah.contains("Mangga"));

        listBuah.remove("Pisang");

        // For-Loop Standar
        System.out.println("\n--- 1. Normal For-Loop (Indeks) ---");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println("Index " + i + ": " + listBuah.get(i));
        }

        // For-Each
        System.out.println("\n--- 2. For-each ---");
        for (String buah : listBuah) {
            System.out.println(buah);
        }

        // Iterator Interface
        System.out.println("\n--- 3. Menggunakan Iterator ---");
        Iterator<String> itr = listBuah.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Lambda Expression (Java 8+)
        System.out.println("\n--- 4. Lambda Expression ---");
        listBuah.forEach(item -> System.out.println(item));

        // Method Reference (Java 8+)
        System.out.println("\n--- 5. Method Reference ---");
        listBuah.forEach(System.out::println);
    }
}