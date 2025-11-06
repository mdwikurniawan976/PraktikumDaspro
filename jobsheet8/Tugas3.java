import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jmlCabang, tsPelanggan = 0, tsItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jmlCabang = s.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = s.nextInt();

            int totalItemCabang = 0;
            for (int p = 1; p <= jmlPelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                int item = s.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            tsPelanggan += jmlPelanggan;
            tsItem += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + tsPelanggan + " orang");
        System.out.println("Item terjual: " + tsItem + " item");
    }
}
