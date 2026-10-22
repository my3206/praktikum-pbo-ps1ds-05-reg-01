package com.fembi.unguided;

public class ModelDeepLearning extends ModelKlasifikasi{
    private int jumlahLayer;

    public ModelDeepLearning(String nama, int jumlahDataLatih,
                             int jumlahKelas, int jumlahLayer) {
        super(nama, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}
