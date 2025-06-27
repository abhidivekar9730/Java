package IntroTopics;

import java.util.Scanner;

public class Q1evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("number is even");
        }else {
            System.out.println("odd number");
        }

    }
}
