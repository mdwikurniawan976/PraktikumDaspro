import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;

        for (int k = 1; k <= n; k++) {
            int sum = 0;
            System.out.print("n = " + k + " jumlah kuadrat = ");

            for (int i = 1; i <= k; i++) {
                int kuadrat = i * i;
                sum += kuadrat;
                System.out.print(kuadrat);
                
                if (i < k) {
                    System.out.print(" + ");
                }
            }

            if (k == 1) {
                System.out.println();
            } else {
                System.out.println(" = " + sum);
            }

        }
    }
}
