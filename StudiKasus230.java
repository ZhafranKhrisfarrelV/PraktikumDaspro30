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

             peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan";
                }
            } else {
                status = "Tidak juara 1, 2, atau 3. Dana penghargaan tidak diberikan";
            }

        } else if (jenis.equals("PKM")) {
            System.out.print("Masukkan jumlah dokumen :");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan";
                }
            } else {
                status = "PKM Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan";
            }

        } else if (jenis.equals("LAINNYA")) {
            status = "Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan";
        } else {
            status = "Jenis kegiatan tidak dikenali.";
        }

        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Status: " + status);

        sc.close();
    }
}

        