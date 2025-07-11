import java.util.Scanner;

public class RentalBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;

        // Input jumlah pelanggan (error handling)
        System.out.print("Masukkan jumlah pelanggan: ");
        try {
            jumlah = Integer.parseInt(input.nextLine());
            if (jumlah <= 0) throw new Exception();
        } catch (Exception e) {
            System.out.println("Input tidak valid! Default 1 digunakan.");
            jumlah = 1;
        }

        // Buat array objek rental
        RentalPlaystation[] daftarRental = new RentalPlaystation[jumlah];

        // Perulangan input
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Pelanggan ke-" + (i + 1));
            System.out.print("Nama Pelanggan: ");
            String nama = input.nextLine();

            System.out.print("No HP         : ");
            String noHp = input.nextLine();

            System.out.print("Tipe Konsol (PS5/PS4/PS3): ");
            String tipe = input.nextLine();

            System.out.print("Lama Sewa (jam): ");
            int jam;
            try {
                jam = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Input tidak valid, default 1 jam digunakan.");
                jam = 1;
            }

            // Buat objek dan masukkan ke array
            daftarRental[i] = new RentalPlaystation(nama, noHp, tipe, jam);
        }

        // Output hasil semua rental
        System.out.println("\n========== RINGKASAN TRANSAKSI ==========");
        for (RentalPlaystation rp : daftarRental) {
            System.out.println("----------------------------------------");
            rp.tampilInfo();
        }

        input.close();
    }
}
