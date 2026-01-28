import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a,b;
        char ch;

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter first Number :");
        a = obj.nextInt();

         System.out.println("Enter Operator :"); 
        ch = obj.next().charAt(0);

        
        System.out.println("Enter second Number :"); 
        b = obj.nextInt();

        int Result =0;

        switch (ch) {
            case '+':Result = a+b;
                break;
        
            case '-':Result = a-b;
                break;
        
            case '*':Result = a*b;
                break;
        
            case '/':Result = a/b;
                break;
        
            default:System.out.println("You entered wrong");
                break;
        }

        System.out.println("Result = " + Result);


    }
}
