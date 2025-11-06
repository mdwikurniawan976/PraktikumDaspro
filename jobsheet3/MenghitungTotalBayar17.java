import java.util.Scanner;
public class MenghitungTotalBayar17 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}
