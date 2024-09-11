import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        PersegiPanjang pp2 = new PersegiPanjang();
       
        pp.PanjangPersegi = 4;
        pp.LebarPersegi = 10; 
    
        pp2.PanjangPersegi = 5;
        pp2.LebarPersegi = 4;

        pp.getKeliling();
        pp.getLuas();
        pp.displayInfo();
        System.out.println();
        System.out.println();
        pp2.getKeliling();
        pp2.getLuas();
        pp2.displayInfo();

        // pp.PanjangPersegi();
        // pp.LebarPersegi();
        // pp.getKeliling();
        // pp.getLuas();
        // pp.displayInfo();


        
    }
}