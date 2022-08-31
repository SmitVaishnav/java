import java.util.*;
class side{
    public static void main(String args[]){
        double side;
        int a,b,x;

        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        a=s.nextInt();
        System.out.println("enter b");
        b=s.nextInt();
        System.out.println("enter x");

        x=s.nextInt();
        side=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-(2*a*b*(Math.cos(x))));
        System.out.println(side);








    }




}