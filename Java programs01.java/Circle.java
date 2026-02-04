import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        float r;
        double pi=3.14,area;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius of Circle :");
        r =obj.nextFloat();

        area = pi*r*r;
        System.out.println("Area of Circle is "+area);
    }
}
