package IntroTopics;

import java.util.Scanner;

public class bignumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        if (a >= b && a >= c ) {
            System.out.println("Largest number :" + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number :" + b);
        } else {
            System.out.println("Largest number :" + c);
        }
    }
}
