import java.util.Scanner;
public class StatusKelulusan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String predikat;
        double ipk;
        int prestasi;

        System.out.print("Masukkan jumlah prestasi :");
        prestasi = s.nextInt();
        System.out.print("Masukkan ipk : ");
        ipk = s.nextDouble();

        if (ipk > 3.5 && prestasi > 5) {
            predikat = "cumlaude";
        } else if (ipk > 3.5 && prestasi > 0 && prestasi < 5) {
            predikat = "baik sekali";
        } else {
            predikat = "baik";
        }

        System.out.println("Predikat Kelulusan: " + predikat);
    }
}

