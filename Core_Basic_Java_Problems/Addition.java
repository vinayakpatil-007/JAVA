                // Addition of Two Number
import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        int a,b;
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter first number :");
        a = obj.nextInt();
        System.out.print("Enter second number :");
        b = obj.nextInt();
        System.out.print("sum is :"+ (a+b));
    }
}