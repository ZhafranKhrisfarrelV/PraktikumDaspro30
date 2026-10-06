import java.util.Scanner;

public class StudiKasus130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: Rp");
        uangBayar = sc.nextInt();

         // Hitung total harga, diskon awal 0
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Diskon 10% jika total harga >= 100000
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung total bayar
        totalBayar = totalHarga - diskon;

        // Output rincian
        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        // Cek uang bayar
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }

        sc.close();
    }
}

      