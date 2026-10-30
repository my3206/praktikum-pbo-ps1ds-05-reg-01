package com.fembi.guided.Default_Method_dan_Static_Method_pada_Interface;

// Fondasi umum: belum punya peran spesifik; jadi tidak boleh diinisiasi langsung
public abstract class Employee implements Payable {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    // Setiap pegawai pasti punya gaji tapi rumusnya berbeda-beda
    public abstract double earnings();
    
    // Saat ada penagihan, alihkan langsung ke metode kalkulasi gaji (earnings)
    @Override
    public double getPaymentAmount(){
        return earnings();
    }
}

