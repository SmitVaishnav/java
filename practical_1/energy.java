import java.util.*;

class energy{
    public static void main(String args[]){
        float energy;
        int m,a,h,v;
        Scanner s=new Scanner(System.in);
        System.out.println("enter m");
        m=s.nextInt();
        System.out.println("enter a");
        a=s.nextInt();
        System.out.println("enter h");
        h=s.nextInt();
        System.out.println("enter v");
        v=s.nextInt();
        energy=m*(a*h+((v*v)/2));
        System.out.println(energy);








    }
}