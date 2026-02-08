import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=obj.nextInt();

        for (int i = 1; i <n; i++) {
            if (n%i==0) {
                sum +=i;
            }
        }

        if (sum==n) {
            System.out.println(n+" is a Perfect Number");
        }
    }
}