import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,r,a=0,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=obj.nextInt();
        c=n;

        while (n>0) {
            r = n%10;
            a=(r*r*r)+a;
            n=n/10;
        }

        if (a==c) {
            System.out.println("Number is a ArmStrong");
        }

        else{
           System.out.println("Number is Not a ArmStrong"); 
        }
    }
}
