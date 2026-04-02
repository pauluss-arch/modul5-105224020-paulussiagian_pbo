public class Rekening {
    private Double saldo;
    private String namaPemilik;

    public Rekening(String namaPemilik, Double SaldoAwal){
        this.namaPemilik = namaPemilik;
        if(SaldoAwal >= 0){
            this.saldo =SaldoAwal;
        }else{
            this.saldo = 0;
            System.out.println("PERINGATAN: saldo awal tidak boleh negatif");
        }
    }

    public getsaldo(){
        return saldo;
    }
   
    public void setsaldo(Double saldoBaru){
        if(saldoBaru >= 0){
            this.saldo =saldoBaru;
            System.out.println("saldo berhasil diperbaharui menjadi :" + this.saldo);
        }else{
            System.out.println("ERORR : Transaksi ditolak! saldo tidak boleh diubah menjadi negatif");
        }
    }
    public void cetakinformasi(){
        System.out.println("Pemilik: "+ namaPemilik + " Saldo Saat ini"+ saldo);
    }
}
