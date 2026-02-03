import java.util.Scanner;

public class Multiphication_Table {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = obj.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}