import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Maulidya_2310131120003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Pekerjaan: ");
        String pekerjaan = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir (dd-mm-yyyy): ");
        String tanggalLahirInput = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput, formatter);
        LocalDate tanggalSekarang = LocalDate.now();

        int umur = (int) ChronoUnit.YEARS.between(tanggalLahir, tanggalSekarang);
        int tahunPensiun = tanggalLahir.getYear() + 40;

        System.out.println("\nOutput:");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Pekerjaan      : " + pekerjaan);
        System.out.println("Tanggal Lahir  : " + tanggalLahir.format(formatter));
        System.out.println("Umur           : " + umur);
        System.out.println("Tahun Pensiun  : " + tahunPensiun);
    }
}
