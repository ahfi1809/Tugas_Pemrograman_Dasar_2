import java.util.Scanner;

class Identitas {
    Scanner input = new Scanner(System.in);
}

class NIK extends Identitas {
    public void karyawan() {
        System.out.print("Masukkan NIK Anda: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahun = input.nextInt();
        input.nextLine(); 
        System.out.print("Masukkan Pekerjaan Anda: ");
        String pekerjaan = input.nextLine();

        System.out.println("\nNIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Lahir : " + tahun);
        System.out.println("Tahun Pensiun : " + (tahun + 60));
        System.out.println("Pekerjaan : " + pekerjaan);
    }
}

class MIkhwanNoor_2310131210005 {
    public static void main(String[] args) {
        NIK iwan = new NIK();
        iwan.karyawan();
    }
}
