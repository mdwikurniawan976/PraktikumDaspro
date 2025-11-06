package jobsheet9;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jmlMhs;
        double rata;
        int totalNilai = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        jmlMhs = s.nextInt();

        int [] nilaiMhs = new int[jmlMhs];
        
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = s.nextInt();
            totalNilai += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rata = (double) totalNilai / jmlMhs;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        System.out.printf("Rata-rata nilai mahasiswa: %.2f\n", rata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
