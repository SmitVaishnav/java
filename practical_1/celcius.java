import java.util.*;
class celcius{
    public static void main(String args[]){
        int f;
        double c;
        Scanner s = new Scanner(System.in);
        System.out.print("enter your number");
        f = s.nextInt();
        c=f-32/1.8;
        System.out.println(c);
    }
}