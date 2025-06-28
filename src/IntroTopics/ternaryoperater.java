package IntroTopics;

import java.util.Scanner;

public class ternaryoperater {
    public static void main(String[] args) {
        System.out.println("enter tour mark : ");
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        String result = (mark > 70) ? "pass": "fail";

        System.out.println(result);
    }
}
