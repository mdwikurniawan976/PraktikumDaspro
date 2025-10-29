
import java.util.Scanner;
public class CaseMethod1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        int nimMahasiswa = sc.nextInt();

        // input nilai matkul 1
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        int nilaiUtsMatkul1 = sc.nextInt();
        System.out.print("Nilai UAS: ");
        int nilaiUasMatkul1 = sc.nextInt();
        System.out.print("Nilai Tugas: ");
        int nilaiTugasMatkul1 = sc.nextInt();

        // input nilai matkul 2
        System.out.println("--- Mata Kuliah 2: Strukur Data ---");
        System.out.print("Nilai UTS: ");
        int nilaiUtsMatkul2 = sc.nextInt();
        System.out.print("Nilai UAS: ");
        int nilaiUasMatkul2 = sc.nextInt();
        System.out.print("Nilai Tugas: ");
        int nilaiTugasMatkul2 = sc.nextInt();

        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("NIM Mahasiswa: " + nimMahasiswa);

    }
}