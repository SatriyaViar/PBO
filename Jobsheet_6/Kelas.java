/**
 * Kelas
 */
public class Kelas {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yanny Ayuningtyas";
        dosen1.nip = "342329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getInfo());
    }
}