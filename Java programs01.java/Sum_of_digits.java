import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
         int n,r,sum=0;
        Scanner o = new Scanner(System.in);
        System.out.println("Enter a Number :");
        n=o.nextInt();

        while (n>0) {
            r=n%10;
            sum+=r;
            n=n/10;

        }
        System.out.println(sum);
    }
}
