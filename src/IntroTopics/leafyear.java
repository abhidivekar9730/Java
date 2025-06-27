package IntroTopics;

import java.util.Scanner;

public class leafyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year :");
        int a = sc.nextInt();

        if((a % 4 == 0 && a % 100 != 0 ) || ( a % 400 == 0)){
            System.out.println("This Leaf year");
        }
        else{
            System.out.println("This not leaf year");
        }
    }
}
