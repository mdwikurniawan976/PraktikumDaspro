import java.util.Scanner;

public class Triangle17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = s.nextInt();

        int i = 1;          // mulai dari 1 biar baris pertama ada 1 bintang
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();   // <-- supaya pindah ke baris baru
            i++;
        }
    }
}
