import java.util.Scanner;

class DataDiri {
    Scanner scanner = new Scanner(System.in); 
}

class NIK extends DataDiri {
    public void karyawan() {
        System.out.print("NIK : ");
        String nik = scanner.nextLine();
    }
}

class Nama extends DataDiri {
    public void karyawan() {
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
    }
}

class Pekerjaan extends DataDiri {
    public void karyawan() {
        System.out.print("Pekerjaan : ");
        String kerja = scanner.nextLine();
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

public class MuhammadSyauqoni_2310131310007 {
    public static void main(String[] args) {
        NIK nik = new NIK();
        Nama nama = new Nama();
        Pekerjaan pekerjaan = new Pekerjaan();
        Lahir lahir = new Lahir();

        nik.karyawan();
        nama.karyawan();
        pekerjaan.karyawan();
        lahir.karyawan();
    }
}