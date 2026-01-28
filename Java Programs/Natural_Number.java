import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        int n;
        Scanner obj= new Scanner(System.in);

        System.out.print("Enter any Number :");
        n = obj.nextInt();
        
        for(int i=1;i<=n; i++){
            System.out.println(i);
        }
    }
}
