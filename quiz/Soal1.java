package quiz;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan harga per porsi: ");
        double hargaPerPorsi = sc.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = sc.nextInt();

        double kebutuhan = hargaPerPorsi * jumlahAnak;
        double persenPotongan = 2; 

        double anggaran = kebutuhan / (1 - persenPotongan / 100);
        double potongan = anggaran * (persenPotongan / 100);
        double nilaiDiterimaMitra = anggaran - potongan;
    
        System.out.println("Anggaran yang diajukan:" + (int) anggaran);
        System.out.printf("Potongan %.2f%%: %.2f\n", (int) persenPotongan, potongan);
        System.out.print("Nilai diterima mitra:" + (int) nilaiDiterimaMitra);
    }
}