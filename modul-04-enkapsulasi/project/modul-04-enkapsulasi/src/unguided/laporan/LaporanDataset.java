package unguided.laporan;

import unguided.model.Dataset;

public class LaporanDataset {
    public void cetak(Dataset data) {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + data.getNama());
        System.out.println("Jumlah Baris : " + data.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + data.getJumlahKolom());

        System.out.printf(
            "Missing      : %d sel (%.2f%%)%n",
            data.getJumlahMissing(),
            data.getPersentaseMissing()
        );

        if (data.perluDibersihkan()) {
            System.out.println("Status       : Perlu dibersihkan");
        } else {
            System.out.println("Status       : Bersih");
        }

        System.out.println();
    }
}
