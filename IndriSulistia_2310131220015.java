import java.util.Scanner;

class Person {
    private String nik;
    private String nama;
    private String pekerjaan;
    public int tahunLahir; 
    private int bulanLahir;
    private int tanggalLahir;

    public Person(String nik, String nama, String pekerjaan, int tahunLahir, int bulanLahir, int tanggalLahir) {
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.tahunLahir = tahunLahir;
        this.bulanLahir = bulanLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur() {
        int tahunSekarang = 2024; // Asumsi tahun saat ini
        return tahunSekarang - this.tahunLahir;
    }

    public void displayInfo() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tanggal Lahir: " + tahunLahir + "-" + bulanLahir + "-" + tanggalLahir);
        System.out.println("Umur: " + getUmur());
    }
}

class Pegawai extends Person {
    public Pegawai(String nik, String nama, int tahunLahir, int bulanLahir, int tanggalLahir) {
        super(nik, nama, "Pegawai", tahunLahir, bulanLahir, tanggalLahir);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tahun Pensiun: " + (tahunLahir + 60)); // Usia pensiun 60 tahun untuk pegawai
    }
}

class PekerjaanLain extends Person {
    public PekerjaanLain(String nik, String nama, String pekerjaan, int tahunLahir, int bulanLahir, int tanggalLahir) {
        super(nik, nama, pekerjaan, tahunLahir, bulanLahir, tanggalLahir);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tahun Pensiun: Tidak ada usia pensiun khusus");
    }
}

public class IndriSulistia_2310131220015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Pekerjaan (Pegawai/Lainnya): ");
        String pekerjaan = scanner.nextLine();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        Person person;
        if (pekerjaan.equalsIgnoreCase("Pegawai")) {
            person = new Pegawai(nik, nama, tahunLahir, bulanLahir, tanggalLahir);
        } else {
            person = new PekerjaanLain(nik, nama, pekerjaan, tahunLahir, bulanLahir, tanggalLahir);
        }

        System.out.println("\nData Pegawai:");
        person.displayInfo();

        scanner.close();
    }
}
