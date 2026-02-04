// 1.Semiparameter
// 2.Area

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double sp,a,b,c;
        Scanner obj = new Scanner(System.in);
         System.out.print("Enter side a: ");
        a = obj.nextDouble();

        System.out.print("Enter side b: ");
        b = obj.nextDouble();

        System.out.print("Enter side c: ");
        c = obj.nextDouble();
        
        sp=a+b+c/2;

        double Area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.println(Area);
    }
}
