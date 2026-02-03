import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        System.out.println("Enter operator :");
        ch =obj.nextInt();

        if (ch==1) {
            cal=n1+n2;
        }
        else if (ch==2) {
            cal=n1-n2;
        }
        else if (ch==3) {
            cal=n1*n2;
        }
        else if (ch==4) {
            cal=n1/n2;
        }
        else{
            cal=n1%n2;
        }
        System.out.println(cal);
    }
}
