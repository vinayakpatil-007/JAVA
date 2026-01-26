import java.util.Scanner;

public class Nested_if_else {
    public static void main(String[] args) {
        int A,B,C;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        A = obj.nextInt();
        B = obj.nextInt();
        C = obj.nextInt();

        if(A>B){
            if (A>C) {
                System.out.println("A is greatest of all");
            }
            else{
                System.out.println("C is greatest of all");
            }
        }

        else{
            if (B>C) {
                System.out.println("B is greatest of all");
            }
            else{
                System.out.println("C is greatest of all");
            }
        }
    }
}
