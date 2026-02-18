import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner o =new Scanner(System.in);
        System.out.println("Enter number of Rows And Colomn :");
        int a =o.nextInt();
        for (int i = 1; i <=a; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
        System.out.println();
        }
    }
}
