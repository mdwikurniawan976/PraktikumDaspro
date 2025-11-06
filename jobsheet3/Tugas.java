import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double bunga = 0.01;
        double sisa, total, cicilan;
        
        System.out.print("Masukkan harga motor : ");
        x = sc.nextInt();
        System.out.print("Masukkan uang muka : ");
        y = sc.nextInt();
        System.out.print("Masukkan lama cicilan (dalam bulan) : ");
        z = sc.nextInt();

        sisa = x - y;
        bunga = sisa * 0.01 * z;
        total = sisa + bunga;
        cicilan = total / z;
        
        System.out.println("Sisa pembayaran : " + (long) sisa);
        System.out.println("Total cicilan dalam perbulan : " + (int) cicilan);
    }
}
