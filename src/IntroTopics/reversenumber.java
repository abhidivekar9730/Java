package IntroTopics;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int ans = 0;

        while (n > 0){

            int rem  = n % 10;

            ans = ans * 10 + rem;
            n = n / 10;
        }

        System.out.println("Here's a reverse number : " + ans);
    }
}
