import java.util.*;

public class Pattern02 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of Rows :");
        int n=obj.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= i; j2++) {
                    System.out.print("*");
                }
            System.out.println("");    
        }
    }
}
