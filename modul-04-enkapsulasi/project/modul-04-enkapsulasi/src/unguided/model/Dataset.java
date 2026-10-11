package unguided.model;

public class Dataset {
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;

    // Constructor tanpa parameter
    public Dataset() {
        nama = "";
        jumlahBaris = 0;
        jumlahKolom = 0;
        jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor dengan parameter nama
    public Dataset(String nama) {
        this.nama = nama;
        jumlahBaris = 0;
        jumlahKolom = 0;
        jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor lengkap
    public Dataset(String nama, int jumlahBaris,
                   int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    // Getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter jumlah baris
    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    // Getter dan setter jumlah kolom
    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    // Getter dan setter jumlah missing
    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Menghitung persentase missing
    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0;
        }

        return (double) jumlahMissing / totalSel * 100;
    }

    // Memeriksa apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    // Mengambil total objek tanpa membuat objek baru
    public static int getTotalDataset() {
        return totalDataset;
    }
}
