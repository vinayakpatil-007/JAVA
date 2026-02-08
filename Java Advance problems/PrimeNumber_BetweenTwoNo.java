import java.util.*;

public class PrimeNumber_BetweenTwoNo {
    public static void main(String[] args) {
         int n1,n2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two Number :");
        n1=obj.nextInt();
        n2=obj.nextInt();
        

        for (int i = n1; i <=n2; i++) {
            int count=0;
            
            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    count++;
                }
            }

            if (count==2) {
                System.out.println(i);
            }
        }
    }
}
