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

    public void installment(int Membayar){
        if (0.1 * TotalPinjaman < Membayar ) {
            TotalPinjaman -= Membayar;
        }else{
            System.out.println("Maaf, Cicilan harus 10% dari jumlah pinjaman");
        }
        
    }
}
