package Assigment_JS07;

public class Segitiga {
  
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total Sudut (1 angle): " + segitiga.totalSudut(90));

        System.out.println("Total Sudut (2 angles): " + segitiga.totalSudut(60, 30));

        System.out.println("Keliling (3 sides): " + segitiga.keliling(3, 4, 5));

        System.out.println("Keliling (hypotenuse): " + segitiga.keliling(3, 4));
    }
}