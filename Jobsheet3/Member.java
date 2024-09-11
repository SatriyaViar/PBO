package Jobsheet3;

/**
 * TestCooperative
 */
public class Member {

    private String cardNumber;
    private String nama;
    private int limitPinjaman;
    private int TotalPinjaman;

    public Member(String cardNumber, String nama, int limitPinjaman){
      this.cardNumber = cardNumber;
      this.nama = nama;
      this.limitPinjaman = limitPinjaman;
    //   this.Pinjaman = 0;
    }
    
    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getTotalPinjaman(){
        return TotalPinjaman;
    }

    public void pinjaman(int pinjaman){

        if ( pinjaman + TotalPinjaman < limitPinjaman) {
            TotalPinjaman += pinjaman;
            limitPinjaman -= TotalPinjaman;
        }else{
            System.out.println("Maaf, Pinjaman anda melebihi batas Pinjaman");
        }
    }

    public int installment(int Membayar){
        TotalPinjaman -= Membayar;
        limitPinjaman += Membayar;
        return TotalPinjaman;
    }
}
