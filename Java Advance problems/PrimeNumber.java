import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=obj.nextInt();

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
                System.out.println("Number is Prime Number");
            }

        else{
            System.out.println("Number is Not Prime Number");
        }
        
    }
}
