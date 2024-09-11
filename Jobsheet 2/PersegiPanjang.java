import java.util.Scanner;

/**
 * PersegiPanjang
 */
public class PersegiPanjang {

    Scanner in = new Scanner(System.in);

    public int PanjangPersegi;
    public int LebarPersegi;
    public double LuasPersegi;
    public double KelilingPersegi;

    public int PanjangPersegi(){
        System.out.print("Panjang Persegi : ");
        return PanjangPersegi = in.nextInt();
    }

    public int LebarPersegi(){
        System.out.print("Lebar Persegi : ");
        return LebarPersegi = in.nextInt();
    }
    public double getLuas(){
       return LuasPersegi = PanjangPersegi * LebarPersegi ;
    
    }
    public double getKeliling(){
        return KelilingPersegi = 2 * (PanjangPersegi + LebarPersegi);
    }

    public void displayInfo(){
        System.out.println("Panjang Persegi     : " + PanjangPersegi);
        System.out.println("Lebar Persegi       : " + LebarPersegi);
        System.out.println("Luas Persegi        : " + LuasPersegi);
        System.out.println("Keliling Persegi    : " + KelilingPersegi);
    }
}