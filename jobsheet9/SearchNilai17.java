package jobsheet9;
import java.util.Scanner;

public class SearchNilai17 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean cari = false;
        int hasil = 0;
        int bnykNilai, key;

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        bnykNilai = s.nextInt();

        int[] arrNilai = new int[bnykNilai];

        for (int i = 0; i < bnykNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arrNilai[i] = s.nextInt();
        }
        

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = s.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                cari = true;
                hasil = i;
                break;
            }
        }
        System.out.println();

        if(!cari ) {
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        } else {

            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
            System.out.println();
        }
    }
}
