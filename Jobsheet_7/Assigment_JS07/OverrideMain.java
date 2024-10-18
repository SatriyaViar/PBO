package Assigment_JS07;

/**
 * OverrideMain
 */
public class OverrideMain {

    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.bernafas(); 
        mahasiswa.makan();     
        mahasiswa.tidur();

        Dosen dosen = new Dosen();
        dosen.bernafas(); 
        dosen.makan();     
        dosen.lembur();
    }
}