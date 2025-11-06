package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            double totalLulus = 0, totalTdkLulus = 0;
            double rataLulus;
            int jumlahmhs, jumlahLulus = 0, jumlahTdkLulus = 0;
            double rataTdkLulus;
            
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlahmhs = s.nextInt();
            int[] nilaiMhs = new int[jumlahmhs];

            for (int i = 0; i < jumlahmhs; i++) {
             
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = s.nextInt();
            }
            for (int i = 0; i < jumlahmhs; i++) {
                if (nilaiMhs[i] > 70) {
                    totalLulus += nilaiMhs[i];
                    jumlahLulus++;
                } else {
                    totalTdkLulus += nilaiMhs[i];
                    jumlahTdkLulus++;
                }
            }

            rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
            rataTdkLulus = (jumlahTdkLulus > 0) ? totalTdkLulus / jumlahTdkLulus : 0;
            System.out.printf("Rata-rata nilai lulus = %.1f\n", rataLulus);
            System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rataTdkLulus);

        }
}
