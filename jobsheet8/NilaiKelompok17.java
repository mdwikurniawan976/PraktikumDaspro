import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, nilai;
        float totalNilai, rataNilai;
        float maxRata = 0;
        int Kelompok = 0;
        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = s.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": Nilai rata-rata = " + rataNilai);

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                Kelompok = i;
            }
            i++;
        }
        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok " + Kelompok + " dengan nilai " + maxRata);
    }
}
