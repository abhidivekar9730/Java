package IntroTopics;

import java.util.Scanner;

public class weeks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 : ");
        int a = sc.nextInt();

        String week;

        switch (a){

            case 1:
                week = "sunday";
                break;
            case 2:
                week = "monday";
                break;
            case 3:
                week = "thusday";
                break;
            case 4:
                week = "wensday";
                break;
            case 5:
                week = "thirsday";
                break;
            case 6:
                week = "firday";
                break;
            case 7:
                week = "saturday";
                break;
            default:
                week = "not valid number";
                break;
        }

        System.out.println("Day : " + week);
    }
}
