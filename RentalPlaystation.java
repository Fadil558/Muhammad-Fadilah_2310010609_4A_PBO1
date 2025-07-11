// Class turunan: RentalPlaystation (extends Pelanggan)
public class RentalPlaystation extends Pelanggan {
    private String tipeKonsol;
    private int lamaSewa;
    private int hargaPerJam;

    // Constructor utama
    public RentalPlaystation(String nama, String noHp, String tipeKonsol, int lamaSewa) {
        super(nama, noHp);
        this.tipeKonsol = tipeKonsol;
        this.lamaSewa = lamaSewa;
        setHargaPerJam(); // otomatis atur harga berdasarkan konsol
    }

    // Constructor overloading (default PS3)
    public RentalPlaystation(String nama, String noHp, int lamaSewa) {
        this(nama, noHp, "PS3", lamaSewa); // default tipe PS3
    }

    // Penentuan harga berdasarkan tipe (seleksi)
    private void setHargaPerJam() {
        switch (tipeKonsol.toUpperCase()) {
            case "PS5": hargaPerJam = 10000; break;
            case "PS4": hargaPerJam = 8000; break;
            default: hargaPerJam = 5000; break;
        }
    }

    // Method menghitung total biaya
    public int hitungBiaya() {
        return hargaPerJam * lamaSewa;
    }

    // Overriding
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tipe Konsol     : " + tipeKonsol);
        System.out.println("Lama Sewa       : " + lamaSewa + " jam");
        System.out.println("Harga per Jam   : Rp " + hargaPerJam);
        System.out.println("Total Biaya     : Rp " + hitungBiaya());
    }
}
