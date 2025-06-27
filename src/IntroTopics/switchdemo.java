package IntroTopics;

public class switchdemo {
    public static void main(String[] args) {

        int number = 5;

        String size;

        switch(number){

            case 29:
                size = "small";
                break;
            case 42:
                size = "medium";
                break;
            case 48:
                size = "large";
                break;
            case 50:
                size = "extra-large";
                break;
            default:
                size = "unkown";
                break;

        }

        System.out.println("size : " + size);
    }
}

