// Class dasar: Pelanggan
public class Pelanggan {
    private String nama;
    private String noHp;

    // Constructor
    public Pelanggan(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    // Accessor
    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Method tampil
    public void tampilInfo() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("No HP          : " + noHp);
    }
}
