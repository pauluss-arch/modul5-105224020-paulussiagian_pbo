public class Main {
    public static void main(String[] args) {
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 2, -10000);
        KamarHotel kamar2 = new KamarHotel("102", "Premium", 2);
        kamar2.setHargaPerMalam(100000);

        System.out.println("\n--- Simulasi Operasional ---");
        System.out.println("Tagihan Kamar 1 (2 malam, PROMO): " + kamar1.hitungTotalBayar(2, "PROMO"));
        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);
        kamar2.pesanKamar();
        System.out.println("Tagihan Kamar 2 (4 malam, PROMO): " + kamar2.hitungTotalBayar(4, "PROMO"));

        System.out.println("\n--- Struk Informasi Akhir ---");
        kamar1.tampilkanProfil();
        kamar2.tampilkanProfil(); 
    }
}