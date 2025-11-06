package week2;

public class ContohVariabel17 {

    public static void main(String[] args){
        String hobi = "Bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 20;
        double ipk = 3.24, tinggiBadan = 1.78;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk,tinggiBadan));
    }
}
