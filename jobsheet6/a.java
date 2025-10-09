import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("A : ");
        int a = sc.nextInt();
       
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();
        
        if (a > b) {
            if (a > c) 
                System.out.print("Bilangan maks A =  " + a);
        } else if (b > c) System.out.print("Bilangan maks B =  " + b);
         else 
             System.out.print("Bilangan maks C =  " + c);
    }
}
