import java.util.Scanner;

/**
 * MiniKakulator
 */
public class MiniKakulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
       
        
        System.out.println("Masukan Angka");
        angka1 = in.nextDouble();
        System.out.println("Masukan Operator (+,-, /, *)");
        char Operator = in.next().charAt(0);
        System.out.println("Masukan Angka Kedua");
        angka2 = in.nextDouble();
        
        switch (Operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '/':
                hasil = angka1 / angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
            default:
                break;
        }
        System.out.println("Hasilnya=" + hasil);
    }
}