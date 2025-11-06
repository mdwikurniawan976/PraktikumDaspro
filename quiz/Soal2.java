package quiz;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilanganDesimal;

        System.out.print("Masukkan bilangan desimal: ");
        bilanganDesimal = sc.nextInt();

        int satuan = bilanganDesimal % 10;
        int puluhan = (bilanganDesimal / 10) % 10;
        int ratusan = (bilanganDesimal / 100) % 10;
        int ribuan = (bilanganDesimal / 1000) % 10;

        System.out.println("Satuan = " + satuan);
        System.out.println("Puluhan = " + puluhan);
        System.out.println("Ratusan = " + ratusan);
        System.out.println("Ribuan = " + ribuan);
    }

}