package com.fembi.unguided;

public class ModelKlasifikasi extends Model{
    private int jumlahKelas;

    public ModelKlasifikasi(String nama, int jumlahDataLatih,
                            int jumlahKelas) {
        super(nama, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }
}
