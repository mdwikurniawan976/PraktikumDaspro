package jobsheet5;

import java.util.Scanner;
public class sistemHostpotKampus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pengguna;
        int SKS;
        System.out.println("--- Sistem Hotspot Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        pengguna = sc.next();
        if(pengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if(pengguna.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukkan jumlah SKS: ");
            SKS = sc.nextInt();
            if(SKS >= 12){
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS Kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
