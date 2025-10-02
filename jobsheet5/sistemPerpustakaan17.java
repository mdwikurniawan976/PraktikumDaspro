package jobsheet5;
import java.util.Scanner;
public class sistemPerpustakaan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kartu;
        boolean sudahRegist;

        System.out.println("--- Sistem Perpustakaan ---");
        System.out.print("Apakah anda membawa kartu mahasiswa (ya/tidak)? ");
        kartu = sc.next();
        System.out.print("Apakah anda sudah registrasi (true/false)? ");
        sudahRegist = sc.nextBoolean();

        if(kartu.equalsIgnoreCase("ya") || sudahRegist){
            System.out.println("boleh masuk");
        } else {
            System.out.println("ditolak masuk");
        }
    }
}