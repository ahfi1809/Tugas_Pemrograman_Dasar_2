import java.util.Scanner;
class Identitas {
  String nik;
  String nama;
  int tanggalLahir;
  int bulanLahir;
  int tahunLahir;

  public void isi(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("NIK: ");
    nik = scanner.nextLine();
    System.out.print("Nama: ");
    nama = scanner.nextLine();
    System.out.print("Tanggal Lahir: ");
    tanggalLahir = scanner.nextInt();
    System.out.print("Bulan Lahir: ");
    bulanLahir = scanner.nextInt();
    System.out.print("Tahun Lahir: ");
    tahunLahir = scanner.nextInt();
  }

  public void tampilkan(){
    System.out.println("NIK: " + nik);
    System.out.println("Nama: " + nama);
    System.out.println("Tanggal Lahir: " + tanggalLahir);
    System.out.println("Bulan Lahir: " + bulanLahir);
    System.out.println("Tahun Lahir: " + tahunLahir);
  }
}

class Biodata extends Identitas{
  public void tampilkan(){
    System.out.println("NIK: " + nik);
    System.out.println("Nama: " + nama);
    System.out.println("Tanggal Lahir: " + tanggalLahir);
    System.out.println("Bulan Lahir: " + bulanLahir);
    System.out.println("Tahun Lahir: " + tahunLahir);
    System.out.print("Pensiun: " + (tahunLahir + 60));
  }
}

public class AkhmadRizkiRahmatullah_2310131210017{
  public static void main(String[] args){
    Identitas identitas = new Biodata();
    identitas.isi();
    identitas.tampilkan();
  }
}