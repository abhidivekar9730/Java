package IntroTopics;

public class continuestatment {

    public static void main(String[] args) {

        int i = 1, j = 1;

        while (i <= 3){

            System.out.println("outer loop" + i);

            while (j <= 3){
                if(j == 2){
                    j++;
                    continue;
                }

                System.out.println("Inner loop" + j);
                j++;
            }
            i++;
        }
    }
}
