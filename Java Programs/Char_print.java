import java.util.Scanner;

public class Char_print {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Number :");
        Scanner obj = new Scanner(System.in);
        ch = obj.next().charAt(0);

        System.out.println(ch);
    }
}
