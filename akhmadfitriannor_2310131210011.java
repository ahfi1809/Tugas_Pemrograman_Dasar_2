
import java.util.Scanner;

class DataDiri {

    Scanner scanner = new Scanner(System.in); // Scanner diinisialisasi di kelas induk
}

class NIK extends DataDiri {

    public void karyawan() {
        System.out.print("NIK : ");
        String nk = scanner.nextLine();
    }
}

class Nama extends DataDiri {

    public void karyawan() {
        System.out.print("Nama : ");
        String nm = scanner.nextLine();
    }
}

class Pekerjaan extends DataDiri {

    public void karyawan() {
        System.out.print("Pekerjaan : ");
        String pkj = scanner.nextLine();
    }
}

class Lahir extends DataDiri {

    public void karyawan() {
        System.out.print("Tanggal Lahir (tahun) : ");
        int lahir = scanner.nextInt();
        int pensiun = lahir + 60;
        System.out.println("Usia pensiun: " + pensiun);
    }
}

public class akhmadfitriannor_2310131210011 {

    public static void main(String[] args) {
        NIK nikObj = new NIK();
        Nama namaObj = new Nama();
        Pekerjaan pekerjaanObj = new Pekerjaan();
        Lahir lahirObj = new Lahir();

        nikObj.karyawan();
        namaObj.karyawan();
        pekerjaanObj.karyawan();
        lahirObj.karyawan();
    }
}
