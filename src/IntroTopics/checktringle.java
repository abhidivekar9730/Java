package IntroTopics;

import java.util.Scanner;

public class checktringle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalene");
        }
    }
}
