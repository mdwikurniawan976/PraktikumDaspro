package jobsheet9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jmlPsnn;

        System.out.print("Masukkan jumlah pesanan: ");
        jmlPsnn = s.nextInt();
        s.nextLine(); 
        String[] namaPesanan = new String[jmlPsnn];
        double[] hargaPesanan = new double[jmlPsnn];
        double totalHarga = 0;

        for (int i = 0; i < jmlPsnn; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = s.nextLine();
            System.out.print("Masukkan harga makanan/minuman ke-" + (i + 1) + ": ");
            hargaPesanan[i] = s.nextDouble();
            s.nextLine();
            totalHarga += hargaPesanan[i];
        }

        System.out.println("\n === Daftar Pesanan ===");
        for (int i = 0; i < jmlPsnn; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println(" Total Biaya: Rp " + totalHarga);
    }
}
