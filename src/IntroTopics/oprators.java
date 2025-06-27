package IntroTopics;

public class oprators {

    public static void main(String[] args) {

        String moive = "Line of duty";

        boolean primesubs = true;
        boolean acorn = true;
        boolean amc = false;

        if(primesubs) {

            if (acorn || amc) {
                System.out.println("Yes, you can watch it enjoy " + moive);

            }
            else if (primesubs || amc){
                    System.out.println("we can recomanded buying either acorn or amc subs to enjoy this moive");

                }
            else{
                    System.out.println("cannot watch moive why don't buy prime subs");
                }
            }


    }
}
