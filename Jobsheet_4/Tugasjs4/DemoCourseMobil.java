package Jobsheet4.Tugasjs4;

import java.time.LocalDate;

/**
 * DemoCourse
 */
public class DemoCourseMobil {

    public static void main(String[] args) {
        Pegawai ani = new Pegawai("Ani Siswanto", "221");
        Pegawai bagus = new Pegawai("Bagus Laras", "112");

        Student student1 = new Student("Bani Ismail", "Mengemudi Mobil");
        Student student2 = new Student("Bahar Subahar", "Mengemudi Mobil");

        ModulPraktek modulPraktek1 = new ModulPraktek(LocalDate.of(2024,8, 11), bagus, 75);
        ModulPraktek modulPraktek2 = new ModulPraktek(LocalDate.of(2024,7, 15), ani, 85);

        student1.addModulPraktek(modulPraktek1);
        System.out.println(student1.getValidasiLisensi());
        System.out.println();

        student2.addModulPraktek(modulPraktek2);
        System.out.println(student2.getValidasiLisensi());
        System.out.println();
     
    }
}