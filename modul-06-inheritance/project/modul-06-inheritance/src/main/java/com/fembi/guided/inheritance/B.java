package com.fembi.guided.inheritance;

public class B extends A {
    int z;
    int hasil;
    
    void jumlahXYZ(){
        hasil = x+y+z;
        
        System.out.println("Jumlah (x+y+z) = " + hasil);
    }
}
