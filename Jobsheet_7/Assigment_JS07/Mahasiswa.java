package Assigment_JS07;
/**
 * Mahasiswa
 */
public class Mahasiswa extends Manusia {
    // Overriding makan method
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan sambil belajar.");
    }

    // Method to simulate sleeping
    public void tidur() {
        System.out.println("Mahasiswa ketiduran gegara banyak tugas");
    }
}