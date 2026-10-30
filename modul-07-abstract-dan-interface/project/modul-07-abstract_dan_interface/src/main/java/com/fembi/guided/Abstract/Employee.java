package com.fembi.guided.Abstract;

// Fondasi umum: belum punya peran spesifik; jadi tidak boleh diinisiasi langsung
public abstract class Employee {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    // Setiap pegawai pasti punya gaji tapi rumusnya berbeda-beda
    public abstract double earnings();
}
