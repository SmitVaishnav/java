import java.util.*;

class eq5{
    public static void main(String[]args){
        double F;
        int L,C,r;

        Scanner s= new Scanner(System.in);
        System.out.println("enter L");
        L=s.nextInt();
        System.out.println("enter C");
        C=s.nextInt();
        System.out.println("enter r");
        r=s.nextInt();

        F=Math.sqrt(1/(L*C))-((r*r)/(4*C));
        System.out.println(F);

    }
}