import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        float a;

        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter side of Square :");
        a = obj.nextFloat();

        System.out.println("Area of Square = "+(a*a));
    }
}
