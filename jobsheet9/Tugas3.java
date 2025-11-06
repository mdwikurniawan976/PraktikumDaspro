package jobsheet9;
import java.util.Scanner;;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice" };
        boolean cari = false;
        String key;

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Masukkan menu yang dicari: ");
        key = s.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                cari = true;
                break;
            }
        }
        System.out.println();
        if (!cari) {
            System.out.println("Menu " + key + " yang dicari tidak ada di menu");
            System.out.println();
        } else {

            System.out.println("Menu " + key + " tersedia");
            System.out.println();
        }

    }
}
