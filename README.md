# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Pemesanan RentalPlaystation menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Data Pelanggan dan Nama, dan memberikan output berupa informasi detail dari Nama tersebut seperti NoHp, TipeKonsol, `HargaPerJam`, `total biaya`dan Lama sewa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pelanggan`, `RentalPlaystation`, dan `RentalBeraksi` adalah contoh dari class.

```bash
public class Pelanggan {
    ...
}

public class RentalPlaystation extends Pelanggan {
    ...
}

public class RentalBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `RentalPlaystation[] daftarRental = new RentalPlaystation[jumlah];` adalah contoh pembuatan object.

```bash
RentalPlaystation[] daftarRental = new RentalPlaystation[jumlah];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`noHp`, `tipeKonsol`, `lamaSewa`, dan `hargaPerjam` adalah contoh atribut.

```bash
private String nama, noHp, tipeKonsol;
private int lamaSewa, hargaPerJam;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pelanggan` dan `RentalPlaystation`.

```bash
public Pelanggan(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }
public RentalPlaystation(String nama, String noHp, String tipeKonsol, int lamaSewa) {
        super(nama, noHp);
        this.tipeKonsol = tipeKonsol;
        this.lamaSewa = lamaSewa;
        setHargaPerJam();
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNoHp` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan  `getNoHp` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

public String getNoHp() {
        return noHp;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `noHp` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String noHp;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `RentalPlaystation` mewarisi `Pelanggan` dengan sintaks `extends`.

```bash
public class RentalPlaystation extends Pelanggan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pelanggan` merupakan overloading method `displayInfo` dan `displayInfo` di `RentalPlaystation` merupakan override dari method `displayInfo` di `Pelanggan`.

```bash
public RentalPlaystation(String nama, String noHp, int lamaSewa) {
        this(nama, noHp, "PS3", lamaSewa);
    }

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
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi dalam method seleksi `switch` dalam method `SetHargaPerJam`.

```bash
private void setHargaPerJam() {
        switch (tipeKonsol.toUpperCase()) {
            case "PS5": hargaPerJam = 10000; break;
            case "PS4": hargaPerJam = 8000; break;
            default: hargaPerJam = 5000; break;
        }
    }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (int i = 0; i < jumlah; i++) {
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
        int jumlah;
System.out.println("\n========== RINGKASAN TRANSAKSI ==========");
        for (RentalPlaystation rp : daftarRental) {
            System.out.println("----------------------------------------");
            rp.tampilInfo();
        }

        input.close();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` RentalPlaystation[] daftarRental = new RentalPlaystation[jumlah];` dan `daftarRental[i] = new RentalPlaystation(nama, noHp, tipe, jam);` adalah contoh penggunaan array.

```bash
 RentalPlaystation[] daftarRental = new RentalPlaystation[jumlah];
 daftarRental[i] = new RentalPlaystation(nama, noHp, tipe, jam);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
System.out.print("Masukkan jumlah pelanggan: ");
try {
jumlah = Integer.parseInt(input.nextLine());
if (jumlah <= 0) throw new Exception();
 } catch (Exception e) {
System.out.println("Input tidak valid! Default 1 digunakan.");
jumlah = 1;
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Fadilah
NPM: 2310010609
