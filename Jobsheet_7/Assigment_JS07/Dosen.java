package Assigment_JS07;

/**
 * Dosen
 */
public class Dosen extends Manusia {

     // Overriding makan method
    @Override
    public void makan(){
        System.out.println("Dosen Makan Di Restoran");
    }
 
     // Method to simulate working overtime
     public void lembur() {
         System.out.println("Dosen bisa Lembur");
     }
}