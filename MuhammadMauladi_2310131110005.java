import java.util.Scanner;

class Identitas {
    protected Scanner miyuki = new Scanner(System.in);
}

class Nik extends Identitas {
    public void pekerja() {
        System.out.print("Masukkan NIK Anda: ");
        String niki = miyuki.nextLine();
        System.out.print("Masukkan Nama Anda: ");
        String name = miyuki.nextLine();
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahun = miyuki.nextInt();
        miyuki.nextLine(); 
        System.out.print("Masukkan Pekerjaan Anda: ");
        String gawi = miyuki.nextLine();

        System.out.println("\nNIK : " + niki);
        System.out.println("Nama : " + name);
        System.out.println("Tahun Lahir : " + tahun);
        System.out.println("Pensiun pada tahun : " + (tahun + 60));
        System.out.println("Pekerjaan : " + gawi);
    }
}

class MuhammadMauladi_2310131110005 {
    public static void main(String[] args) {
        Nik mauladi = new Nik();
        mauladi.pekerja();
    }
}
