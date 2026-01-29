import java.util.Scanner;

public class Sum_of_N_numbers {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any no. :");
        n =obj.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
}
