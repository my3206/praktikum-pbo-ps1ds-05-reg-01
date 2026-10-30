package com.fembi.unguided;

public class Main {
    public static void main(String[] args) {

        // Uji proteksi abstract class
        // TiketBioskop tiket = new TiketBioskop("Film", 40000, 2);

        // Membuka kasir
        ItemTransaksi.catatLogKasir(
                "Membuka transaksi baru untuk Pelanggan #042.");

        // Membuat objek transaksi
        TiketReguler reguler = new TiketReguler(
                "Interstellar", 40000, 2, 3);

        TiketVIP vip = new TiketVIP(
                "Dune: Part Two", 60000, 2, 25000);

        PaketSnack snack = new PaketSnack(
                "Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // Menyimpan objek dalam array polimorfik
        ItemTransaksi[] transaksi = {reguler, vip, snack};

        double totalTransaksi = 0;

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        // Memproses setiap transaksi
        for (ItemTransaksi item : transaksi) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        // Menampilkan total pembayaran
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        System.out.println("=============================================================");

        // Menutup kasir
        ItemTransaksi.catatLogKasir(
                "Transaksi #042 selesai diproses.");
    }
}
