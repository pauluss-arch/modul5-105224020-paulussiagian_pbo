public class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private Double hargaSatuan;
    private String kategori;

   public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0.0;
    }

    public String getidBarang(){
        return idBarang;
    }

    public void setidBarang(String idBarang){
        this.idBarang = idBarang;
    }

    public String getnamaBarang(){
        return namaBarang;
    }

    public void setnamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public String getkategori(){
        return kategori;
    }

    public void setkategori(String kategori){
        this.kategori = kategori;
    }

    public int getstok(){
        return stok;
    }

    public void setstok(int strok){
        if(stok >=0){
            this.stok = stok;
        }else{
            System.out.println("EROR! : Harga satuan barang harus lebih dari 0!");
        }
    }

    public double getHargaSatuan() { 
        return hargaSatuan; 
    }
    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("[ERROR]: Harga satuan harus lebih dari 0!");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("SISTEM : Berhasil menambah " + jumlah + " unit.");
        } else {
            System.out.println("ERROR! : Jumlah tambahan harus positif!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok >= jumlah) {
                this.stok -= jumlah;
                System.out.println("SISTEM : Berhasil mengeluarkan " + jumlah + " unit.");
            } else {
                System.out.println("GAGAL : Stok tidak mencukupi! Sisa: " + this.stok);
            }
        } else {
            System.out.println("ERROR! : Jumlah pengurangan harus positif!");
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("\n====== LAPORAN GUDANG ELEKTRONIK ======");
        System.out.println("ID Barang    : " + idBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok Gudang  : " + stok + " unit");
        System.out.println("Harga Satuan : Rp" + hargaSatuan);
        System.out.println("=======================================");
    }

}
