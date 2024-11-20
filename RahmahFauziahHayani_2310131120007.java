import java.util.Scanner;

class Seorang {
    String nik;
    String nama;
    String pekerjaan;
    int tahunLahir;
    int bulanLahir;
    int tanggalLahir;

    public Seorang(String nik, String nama, String pekerjaan, int tahunLahir, int bulanLahir, int tanggalLahir) {
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.tahunLahir = tahunLahir;
        this.bulanLahir = bulanLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public int hitungUmur(int tahunSekarang, int bulanSekarang, int tanggalSekarang) {
        int umur = tahunSekarang - tahunLahir;

// Jika bulan sekarang lebih kecil dari bulan lahir, kurangi umur
        if (bulanSekarang < bulanLahir || (bulanSekarang == bulanLahir && tanggalSekarang < tanggalLahir)) {
            umur--;
        }

        return umur;
    }

    public int hitungTahunPensiun() {
        return tahunLahir + 60;
    }

    public void displayInfo(int tahunSekarang, int bulanSekarang, int tanggalSekarang) {
        int umur = hitungUmur(tahunSekarang, bulanSekarang, tanggalSekarang);
        int tahunPensiun = hitungTahunPensiun();
        String statusPensiun = (umur >= 60) ? "Pensiun" : "Belum Pensiun";
        
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tanggal Lahir: " + tanggalLahir + "/" + bulanLahir + "/" + tahunLahir);
        System.out.println("Umur: " + umur);
        System.out.println("Tahun Pensiun: " + tahunPensiun);
        System.out.println("Status Pensiun: " + statusPensiun);
    }
}

public class RahmahFauziahHayani_2310131120007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Pekerjaan: ");
        String pekerjaan = scanner.nextLine();
        
        System.out.print("Tanggal Lahir (dd-MM-yyyy): ");
        String tanggalLahirStr = scanner.nextLine();
        
        String[] parts = tanggalLahirStr.split("-");
        int tanggalLahir = Integer.parseInt(parts[0]);
        int bulanLahir = Integer.parseInt(parts[1]);
        int tahunLahir = Integer.parseInt(parts[2]);

        System.out.print("Tanggal Sekarang (dd-MM-yyyy): ");
        String tanggalSekarangStr = scanner.nextLine();
        
        String[] todayParts = tanggalSekarangStr.split("-");
        int tanggalSekarang = Integer.parseInt(todayParts[0]);
        int bulanSekarang = Integer.parseInt(todayParts[1]);
        int tahunSekarang = Integer.parseInt(todayParts[2]);

        Seorang Seorang = new Seorang(nik, nama, pekerjaan, tahunLahir, bulanLahir, tanggalLahir);
        Seorang.displayInfo(tahunSekarang, bulanSekarang, tanggalSekarang);
    }
}
