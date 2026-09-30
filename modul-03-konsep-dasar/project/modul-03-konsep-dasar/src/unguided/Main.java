package unguided;

public class Main {
    public static void main(String[] args) {

        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        PengolahSuhu suhu = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        suhu.tampilkanData();

        int indexKosong = suhu.cariIndexKosong();

        System.out.println("\nIndex hari kosong (dimulai dari 0): "
                + indexKosong);

        suhu.isiDataKosong();

        System.out.println("\n=== Data Suhu Setelah Pengisian ===");
        suhu.tampilkanData();

        System.out.printf("\nRata-rata : %.2f°C%n",
                suhu.hitungRataRata());

        System.out.println("\nIsi array suhuHarian di main "
                + "setelah isiDataKosong() dijalankan:");

        for (double nilai : suhuHarian) {
            System.out.print(nilai + " ");
        }

        /*
         * Array di main ikut berubah karena object PengolahSuhu
         * menyimpan referensi ke array yang sama.
         * Jadi ketika isiDataKosong() mengubah data melalui object,
         * perubahan tersebut juga terlihat pada array di main.
         */
    }
}