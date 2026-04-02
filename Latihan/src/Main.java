public class Main {
    public static void main(String[] args) {
        Karyawan staff = new Karyawan("ALDO-13", "samue");
        staff.setDepartemen("kayang");

        System.out.println("Mencoba input gaji Rp -1.000.000...");
        staff.setGajiPokok(-1000000);

        System.out.println("Input gaji yang valid Rp 8.500.000...");
        staff.setGajiPokok(8500000);

        System.out.println();
        staff.tampilkanDataKaryawan();
    }
}