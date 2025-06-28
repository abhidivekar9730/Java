package DSA;

public class pattern2 {
    public static void main(String[] args) {

        int n = 5;
        int trows = n;
        int spaces = n-1;
        int stars = 1;

        for(int rows = 1; rows <= trows; rows++){

            //work for the current row
            for (int csp = 1; csp <= spaces; csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst = 1; cst <= stars; cst++){
                System.out.print("*");
            }
            //prep for next rows
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}
