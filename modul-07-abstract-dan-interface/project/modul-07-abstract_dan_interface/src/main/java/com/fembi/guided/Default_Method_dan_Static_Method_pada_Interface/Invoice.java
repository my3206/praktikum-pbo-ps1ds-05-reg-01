package com.fembi.guided.Default_Method_dan_Static_Method_pada_Interface;

public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partName, int quantity, double pricePerItem){
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String getPartName(){
        return partName;
    }
    
    // Hitung tagihan
    @Override
    public double getPaymentAmount(){
        return quantity * pricePerItem;
    }
}
