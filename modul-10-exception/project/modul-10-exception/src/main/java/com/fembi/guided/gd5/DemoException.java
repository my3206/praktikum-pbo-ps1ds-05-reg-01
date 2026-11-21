package com.fembi.guided.gd5;

public class DemoException {
    public static void main(String[] args) {
        Coba c = new Coba();

        try {
            c.tampil();
        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Program Selesai");
        }
    }
}