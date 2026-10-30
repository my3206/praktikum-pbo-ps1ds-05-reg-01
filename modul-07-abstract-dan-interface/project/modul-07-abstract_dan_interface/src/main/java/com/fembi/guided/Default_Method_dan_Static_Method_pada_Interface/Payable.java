package com.fembi.guided.Default_Method_dan_Static_Method_pada_Interface;

public interface Payable {
    double getPaymentAmount();
    
    // Fitur baru
    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp" + getPaymentAmount());
    }
    
    // Fungsi utilitas
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG] " + message);
    }
}
