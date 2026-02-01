import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        char ch ;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Any Character :");
        ch = obj.next().charAt(0);

        int a = ch;

        System.out.println(a);
        

    }
}
