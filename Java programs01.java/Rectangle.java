import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float l,b,area;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Length :");
        l=obj.nextFloat();
        System.out.println("Enter Length :");
        b=obj.nextFloat();

        area =l*b;
        System.out.println(area);
    }
}
