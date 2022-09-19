import java.util.*;

public class guess {
    public static void main(String[] args) {
        int flag, n;
//        int min=1;
//        int max=1000000;
        System.out.println(" I'm thinking of a number between 1 and 1,000,000");
        System.out.println("Whats your guess?");
//        int a = (int)(Math.random()*(max-min+1)+min);

        Random rand = new Random();
        int number = rand.nextInt();
        System.out.println("\n" + number);
        Scanner in = new Scanner(System.in);
        restart:
        if (true) {

            n = in.nextInt();
            if (number == n) {
                flag = 1;
            } else {
                flag = 0;
            }

            if (n <= 500000) {
                switch (flag) {
                    case 1:
                        System.out.println("Correct");
                        break;
                    case 0:
                        System.out.println("too low");
                        break restart;
                    default:
                        System.out.println("enter valid range number");
                        break restart;
                }

            } else if (n >= 500000) {
                switch (flag) {
                    case 1:
                        System.out.println("Correct");
                        break;
                    case 0:
                        System.out.println("too low");
                        break restart;
                    default:
                        System.out.println("enter valid range number");
                        break restart;
                }
            }


        }
    }
}