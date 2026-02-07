import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,c,r,s=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=obj.nextInt();

        c=n;

        while (n>0) {
            r = n%10;
            s=(s*10)+r;
            n=n/10;
        }

        if (c==s) {
            System.out.println("Number is a Palindrome");
        }

        else{
           System.out.println("Number is Not a Palindrome"); 
        }
    }
}
