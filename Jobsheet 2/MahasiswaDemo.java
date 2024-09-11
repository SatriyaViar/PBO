/**
 * MahasiswaDemo
 */
public class MahasiswaDemo {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "023445";
        m2.nama = "Tiok Lestari";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";

        m1.displayBiodata();
        System.out.println();
        m2.displayBiodata();
    }
}