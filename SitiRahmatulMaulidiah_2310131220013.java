import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// Kelas dasar untuk menangani tanggal
class Tanggal {
    protected String birthDate; 

    // Method untuk input tanggal lahir
    public void inputTanggal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD): ");
        birthDate = scanner.nextLine();
    }

    // Method untuk mendapatkan tahun dari tanggal lahir
    public int getTahunLahir() {
        LocalDate birth = LocalDate.parse(birthDate);
        return birth.getYear();
    }
}

// Kelas Tahun yang mewarisi Tanggal
class Tahun extends Tanggal {
    public int getCurrentYear() {
        return LocalDate.now().getYear();
    }
}

// Kelas Umur yang mewarisi Tahun
class Umur extends Tahun {
    // Method untuk menghitung umur berdasarkan tanggal lahir
    public int calculateAge() {
        LocalDate birth = LocalDate.parse(birthDate);
        LocalDate today = LocalDate.now();
        return Period.between(birth, today).getYears();
    }
}

// Kelas TahunPensiun yang mewarisi Umur
class TahunPensiun extends Umur {
    // Method untuk menghitung tahun pensiun
    public int calculateRetirementYear() {
        return getTahunLahir() + 60;
    }
}

// Kelas Person untuk mengelola data individu
class Person {
    private String nik;
    private String name;
    private String job;
    private TahunPensiun tahunPensiun;

    // Constructor
    public Person() {
        tahunPensiun = new TahunPensiun();
    }

    // Method untuk menginput data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        nik = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        name = scanner.nextLine();
        System.out.print("Masukkan Pekerjaan: ");
        job = scanner.nextLine();
        // Input tanggal lahir melalui objek TahunPensiun
        tahunPensiun.inputTanggal();
    }

    // Method untuk menampilkan informasi data
    public void displayInfo() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + name);
        System.out.println("Pekerjaan: " + job);
        System.out.println("Umur: " + tahunPensiun.calculateAge() + " tahun");
        System.out.println("Tahun Pensiun: " + tahunPensiun.calculateRetirementYear());
    }
}

// Kelas utama
public class SitiRahmatulMaulidiah_2310131220013 {
    public static void main(String[] args) {
        // Membuat objek Person dan memanggil metode input
        Person person = new Person();
        person.inputData();
        
        // Tampilkan informasi data
        person.displayInfo();
    }
}
