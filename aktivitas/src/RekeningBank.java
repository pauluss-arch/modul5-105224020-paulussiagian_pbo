public class RekeningBank {
    private String nomorRekening;
    private int saldo;

    RekeningBank(String nomorRekening, int saldo){
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public int getsaldo(){
        return this.saldo;
    }

    public void setsaldo(int saldoBaru){
        if(saldoBaru < 0){
            System.out.println("salah");
        }else{
            this.saldo = saldoBaru;
            System.out.println("Mantap");
        }
    }
}
