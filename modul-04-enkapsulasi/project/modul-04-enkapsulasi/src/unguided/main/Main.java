package unguided.main;

import unguided.model.Dataset;
import unguided.laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {

        // Objek 1: constructor tanpa parameter
        Dataset data1 = new Dataset();
        data1.setNama("Titanic");
        data1.setJumlahBaris(891);
        data1.setJumlahKolom(12);
        data1.setJumlahMissing(866);

        // Objek 2: constructor dengan parameter nama
        Dataset data2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset data3 = new Dataset(
            "Iris", 150, 5, 0
        );

        // Menyimpan objek dalam array
        Dataset[] daftarDataset = {
            data1, data2, data3
        };

        // Membuat objek laporan
        LaporanDataset laporan = new LaporanDataset();

        // Mencetak laporan menggunakan perulangan
        for (int i = 0; i < daftarDataset.length; i++) {
            laporan.cetak(daftarDataset[i]);
        }

        // Menampilkan total dataset
        System.out.println(
            "Total dataset dibuat : "
            + Dataset.getTotalDataset()
        );
    }
}
