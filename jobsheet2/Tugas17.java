package week2;

import java.util.Scanner;

public class Tugas17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anak;
        int gajiPerbulan;
        int tunjanganAnak;
        System.out.print("Masukkan jumlah gaji pokok: ");
        gajiPerbulan = sc.nextInt();
        System.out.print("Masukkan tunjangan anak perbulan: ");
        tunjanganAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        anak = sc.nextInt();
        int totalTunjanganAnak = anak * tunjanganAnak;
        int potonganPensiun = (int) (0.05 * gajiPerbulan);
        int gajiKotor = gajiPerbulan + totalTunjanganAnak;
        int gajiBersih = gajiKotor - (int) potonganPensiun;
        System.out.println("Gaji bersih yang diterima Bu Jesi setiap bulannya adalah = " + gajiBersih);
    }   
}

