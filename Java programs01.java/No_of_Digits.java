import java.util.Scanner;

public class No_of_Digits {
    public static void main(String[] args) {
        int n,count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        n = obj.nextInt();

        for (int i = 0; n>0; i++) {
            n = n/10;
            count++;
        }

        System.out.println("Number of Digits :" + count);
    }
}
