import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int Year;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Year :");
        Year=obj.nextInt();

        if (Year % 100==0 && Year % 400==0 || Year % 100!=0 && Year % 4 ==0) {
            System.out.println("Leap year");
        }

        else{
            System.out.println("Not a Leap year");
        }

    }
}
