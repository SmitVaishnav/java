import java.util.*;
class area{

    public static void main(String args[]){
        float area;
        int r,R,h;
        final float pi=3.14f;

        Scanner s= new Scanner(System.in);
        System.out.println("enter r");
        r=s.nextInt();
        System.out.println("enter R");
        R=s.nextInt();
        System.out.println("enter h");
        h=s.nextInt();

        area=(pi*r*r)+(2*pi*R*h);
        System.out.println(area);

    }
}