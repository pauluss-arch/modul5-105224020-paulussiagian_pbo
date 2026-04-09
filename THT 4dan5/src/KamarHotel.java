public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double harga) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(harga); 
        this.isTersedia = true;
    }

    public String getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean isTersedia() { return isTersedia; }

    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || tipe.equalsIgnoreCase("Premium") || tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("Peringatan: Tipe '" + tipe + "' tidak valid. Otomatis diatur ke Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) {
            System.out.println("Peringatan: Harga di bawah 50000 ditolak. Otomatis diatur ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = harga;
        }
    }

     public void batalPesan() {
        this.isTersedia = true; 
    }


    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi.");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Peringatan: Kamar sudah terisi.");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Ditolak: Jumlah tamu (" + jumlahTamu + ") melebihi kapasitas (" + kapasitasMaksimal + ")!");
        } else {
            isTersedia = false;
            System.out.println("Pemesanan berhasil untuk " + jumlahTamu + " orang.");
        }
    }

   
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            System.out.println("Voucher Berhasil: Diskon 20% diterapkan.");
            return total * 0.8;
        } else {
            System.out.println("Voucher Gagal: Syarat tidak terpenuhi atau kode salah. Harga normal diterapkan.");
            return total;
        }
    }

    public void tampilkanProfil() {
        System.out.println("=== Profil Kamar " + nomorKamar + " ===");
        System.out.println("Tipe: " + tipeKamar);
        System.out.println("Kapasitas: " + kapasitasMaksimal + " orang");
        System.out.println("Harga/Malam: Rp" + hargaPerMalam);
        System.out.println("Status: " + (isTersedia ? "Tersedia" : "Dipesan"));
        System.out.println("---------------------------");
    }
}