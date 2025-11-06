package week2;

import java.util.Scanner;

public class Tugas217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lebarTanah, panjangTanah, diameterLingkaran, sisiPersegi;
        int jumlahKolam = 2;

        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();

        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();

        int luasTanah = panjangTanah * lebarTanah;

        System.out.print("Masukkan diameter lingkaran: ");
        diameterLingkaran = sc.nextInt();
        double r = diameterLingkaran / 2.0;
        double luasKolamLingkaran = jumlahKolam * 3.14 * r * r;

        System.out.print("Masukkan panjang sisi: ");
        sisiPersegi = sc.nextInt();
        int luasKolamPersegi = jumlahKolam * (sisiPersegi * sisiPersegi);
        double luasKolam = luasKolamLingkaran + luasKolamPersegi;

        double luasRumput = luasTanah - luasKolam;
        System.out.println("Luas tanah yang akan di tanami rumput taman oleh pak Jaka adalah " + luasRumput);
    }
}