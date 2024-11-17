import java.util.Scanner;

// Kelas dasar (induk)
class Orang {
    public String nik;
    public String nama;
    public String pekerjaan;
    public int tahunLahir;
    public int bulanLahir;
    public int hariLahir;

    public Orang(String nik, String nama, String pekerjaan, int tahunLahir, int bulanLahir, int hariLahir) {
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.tahunLahir = tahunLahir;
        this.bulanLahir = bulanLahir;
        this.hariLahir = hariLahir;
    }

    public void tampilkanData() {
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Pekerjaan     : " + pekerjaan);
        System.out.println("Tanggal Lahir : " + tahunLahir + "-" + bulanLahir + "-" + hariLahir);
    }
}

// Subclass (turunan)
class Karyawan extends Orang {
    public Karyawan(String nik, String nama, String pekerjaan, int tahunLahir, int bulanLahir, int hariLahir) {
        super(nik, nama, pekerjaan, tahunLahir, bulanLahir, hariLahir);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        int tahunSekarang = 2024;
        int umur = tahunSekarang - tahunLahir;
        int tahunPensiun = tahunLahir + 60;
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Tahun Pensiun : " + tahunPensiun);
    }
}

// Kelas utama
public class IndahJumiatin_2310131220009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Pekerjaan: ");
        String pekerjaan = input.nextLine();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Hari Lahir: ");
        int hariLahir = input.nextInt();

        // objek polymorphism
        Orang orang = new Karyawan(nik, nama, pekerjaan, tahunLahir, bulanLahir, hariLahir);

        System.out.println("\nOutput:");
        orang.tampilkanData();
    }
}

