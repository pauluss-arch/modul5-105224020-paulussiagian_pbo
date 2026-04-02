public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang("SUM-24", "Monitor SUMSANG");
        barang.setkategori("Elektronik");        
        System.out.println("--- Menjalankan Tes Keamanan Sistem ---");

        System.out.print("Percobaan harga Rp -50.000: ");
        barang.setHargaSatuan(-50000);

        System.out.print("Percobaan ambil 10 unit (Stok awal 0): ");
        barang.kurangiStok(10);

        System.out.println("\n--- Memasukkan Data Valid Melalui Jalur Resmi ---");
        
        barang.setHargaSatuan(2500000);
        barang.tambahStok(50);
        barang.kurangiStok(12); 
        barang.tampilkanDetailBarang();
    }
}