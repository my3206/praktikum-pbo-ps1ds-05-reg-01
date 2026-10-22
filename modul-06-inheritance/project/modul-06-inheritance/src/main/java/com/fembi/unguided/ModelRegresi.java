package com.fembi.unguided;

public class ModelRegresi extends Model{
    private int jumlahFitur;

    public ModelRegresi(String nama, int jumlahDataLatih,
                        int jumlahFitur) {
        super(nama, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int batch) {
        return getJumlahDataLatih() * epoch / batch;
    }
}
