import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        n = obj.nextInt();

        if (n%2==0) {
            System.out.println("You Entered Even Numbe");
        }

        else{
            System.out.println("You Entered Odd Number");
        }
    }
    
}
