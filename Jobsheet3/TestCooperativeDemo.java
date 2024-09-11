package Jobsheet3;

/**
 * TestCooperative
 */
public class TestCooperativeDemo {

    public static void main(String[] args) {
       Member member1 = new Member("111333444", "Donny", 5000000);

       System.out.println("Member Name  : " + member1.getNama());
       System.out.println("Loan Limit   : " + member1.getLimitPinjaman());

       System.out.println("\nBorrow 10,000,000");
       member1.pinjaman(10000000);
       System.out.println("Current loan amount  : " + member1.getTotalPinjaman());
       
       System.out.println("\nBorrow 4,000,000");
       member1.pinjaman(4000000);
       System.out.println("Current loan amount  : " + member1.getTotalPinjaman());

      System.out.println("\nPaying 1,000,000 installments");
      member1.installment(1000000);
      System.out.println("Current loan amount   : " + member1.getTotalPinjaman());
      
      System.out.println("\nPaying 3,000,000 installment");
      member1.installment(3000000);
      System.out.println("Current loan amount   : " + member1.getTotalPinjaman());
    }
}