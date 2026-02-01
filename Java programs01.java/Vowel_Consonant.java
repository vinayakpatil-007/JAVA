import java.util.Scanner;

public class Vowel_Consonant {

    public static void main(String[] args) {
        char ch;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Any character :");
        ch = obj.next().charAt(0);

        if (ch>='a' && ch<='z') {
            if (ch =='A' || ch =='E' || ch =='I' || ch =='O' ||ch=='U' ) {
            System.out.println("The Character is Vowel.");
            
        }

        else{
            System.out.println("The Character is Consonant.");
        }
        }
    }
}