import java.util.Scanner;

public class StudiKasus230 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis, status;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Masukkan nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Masukkan jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Masukkan juara (isi 0 jika tidak juara) : ");

        