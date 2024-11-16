import java.util.Scanner;

class menghitungPensiun {
    String nik;
    String nama;
    String pekerjaan;
    int tanggal;
    int bulan;
    int tahun;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK\t\t\t: ");
        nik = scanner.nextLine();
        
        System.out.print("Nama\t\t\t: ");
        nama = scanner.nextLine();

        System.out.print("Pekerjaan\t\t: ");
        pekerjaan = scanner.nextLine();

        System.out.print("Tanggal Lahir: ");
        tanggal = scanner.nextInt();

        System.out.print("Bulan Lahir: ");
        bulan = scanner.nextInt();

        System.out.print("Tahun Lahir: ");
        tahun = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tanggal Lahir: " + tanggal + "-" + bulan + "-" + tahun);

        int tahunsekarang = 2024; 
        int bulansekarang = 11; 
        int harisekarang = 16;

        int umur = tahunsekarang - tahun;

        // Menghitung tahun pensiun jika umur pensiun 60 tahun
        int tahunPensiun = tahun + 60;

        System.out.println("Umur: " + umur);
        System.out.println("Tahun Pensiun: " + tahunPensiun);
    }
}

public class SitiAisyah_2310131120009 {
    public static void main(String[] args) {
        menghitungPensiun MenghitungPensiun = new menghitungPensiun();
        MenghitungPensiun.inputData();
        MenghitungPensiun.displayData();
    }
}
