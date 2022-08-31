import java.util.*;

class eq6{
    public static void main(String[] args) {
        double T;
        int m1,m2,g;

        Scanner s = new Scanner(System.in);
        System.out.println("enter m1");
        m1=s.nextInt();
        System.out.println("enter m2");
        m2=s.nextInt();
        System.out.println("enter g");
        g=s.nextInt();

        T=(((2*m1*m2)/(m1+m2))*g);
        System.out.println(T);
    }
}