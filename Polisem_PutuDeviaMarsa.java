import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Class dasar (superclass)
class Person {
    protected String nik;
    protected String name;
    protected String job;
    protected LocalDate birthDate;

    public Person(String nik, String name, String job, LocalDate birthDate) {
        this.nik = nik;
        this.name = name;
        this.job = job;
        this.birthDate = birthDate;
    }

    public void printInfo() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + name);
        System.out.println("Pekerjaan: " + job);
        System.out.println("Tanggal Lahir: " + birthDate);
    }

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int calculateRetirementYear() {
        return birthDate.plusYears(60).getYear(); 
    }
}

class Employee extends Person {
    public Employee(String nik, String name, String job, LocalDate birthDate) {
        super(nik, name, job, birthDate);
    }

    // Overriding method untuk polimorfisme runtime
    @Override
    public int calculateRetirementYear() {
        if (job.equalsIgnoreCase("teacher")) {
            return birthDate.plusYears(65).getYear(); 
        } else if (job.equalsIgnoreCase("worker")) {
            return birthDate.plusYears(58).getYear(); 
        } else {
            return super.calculateRetirementYear(); 
        }
    }
}

public class Polisem_PutuDeviaMarsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        
        System.out.print("Pekerjaan: ");
        String job = scanner.nextLine();
        
        System.out.print("Tanggal Lahir (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        Person person = new Employee(nik, name, job, birthDate);
        
        person.printInfo();
        System.out.println("Umur: " + person.calculateAge());
        System.out.println("Tahun Pensiun: " + person.calculateRetirementYear());

        scanner.close();
    }
}
