import java.util.Scanner;

public class While {
public static void main(String[] args) {
    
    int n;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Vale for condition :");
    n = obj.nextInt();

    int i = 1;

    while (i<=n) {
        System.out.println(i);
        i++;
    }
}
    
}