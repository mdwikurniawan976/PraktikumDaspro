
import java.util.Scanner;
public class CaseMethod1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM  : ");
        long nim = sc.nextLong();

        System.out.println("\n--- Mata Kuliah 1 : Algoritma Pemrograman ---");
        System.out.print("Nilai UTS   : ");

        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas1 = sc.nextInt();

        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas2 = sc.nextInt();

        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        String nilaiHuruf1 = "";
        String nilaiHuruf2 = "";
        String statusM1 = "";
        String statusM2 = "";

        // matkul1
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
        } else if (nilaiAkhir1 > 73) {
            nilaiHuruf1 = "B+";
        } else if (nilaiAkhir1 > 65) {
            nilaiHuruf1 = "B";
        } else if (nilaiAkhir1 > 60) {
            nilaiHuruf1 = "C+";
        } else if (nilaiAkhir1 > 50) {
            nilaiHuruf1 = "C";
        } else if (nilaiAkhir1 > 39) {
            nilaiHuruf1 = "D";
        } else {
            nilaiHuruf1 = "E";
        }

        // matkul2
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
        } else if (nilaiAkhir2 > 73) {
            nilaiHuruf2 = "B+";
        } else if (nilaiAkhir2 > 65) {
            nilaiHuruf2 = "B";
        } else if (nilaiAkhir2 > 60) {
            nilaiHuruf2 = "C+";
        } else if (nilaiAkhir2 > 50) {
            nilaiHuruf2 = "C";
        } else if (nilaiAkhir2 > 39) {
            nilaiHuruf2 = "D";
        } else {
            nilaiHuruf2 = "E";
        }

        if (nilaiAkhir1 >= 60) {
            statusM1 = "LULUS";
        } else {
            statusM1 = "TIDAK LULUS";
        }

        if (nilaiAkhir2 >= 60) {
            statusM2 = "LULUS";
        } else {
            statusM2 = "TIDAK LULUS";
        }

        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        String statusSem;

        if (statusM1.equals("LULUS") && statusM2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSem = "LULUS";
            } else {
                statusSem = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSem = "TIDAK LULUS (Rata-rata < 70)";
        }

        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        // System.out.printf("%-25s %-5s %-5s %-7s %-12s %-13s %-10s%n",
        // "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf",
        // "Status");

        System.out.println("Mata Kuliah             UTS   UAS   Tugas   Nilai Akhir  Nilai Huruf   Status");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.printf("Algoritma Pemrograman    %-5d %-5d %-7d %-12.2f %-13s %-10s\n",
                uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, statusM1);
        System.out.printf("Struktur Data           %-5d %-5d %-7d %-12.2f %-13s %-10s\n",
                uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, statusM2);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester: " + statusSem);
    }
}