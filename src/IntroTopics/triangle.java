package IntroTopics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter a :");
        int b = sc.nextInt();
        System.out.println("Enter a :");
        int c = sc.nextInt();

        if(a + b + c == 180 && a>0 && b>0 && c>0){
            System.out.println("triangle is created");


        }
        else{
            System.out.println("triangle is not created");
        }

    }
}
