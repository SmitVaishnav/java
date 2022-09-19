import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int grade=in.nextInt();


        switch (grade/10){
            case 9,10:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("B+");
                break;
            case 5:
                System.out.println("C");
                break;
            case 4,3,2,1:
                System.out.println("F");
                break;
            default:
                System.out.println("F");

        }

    }
}
