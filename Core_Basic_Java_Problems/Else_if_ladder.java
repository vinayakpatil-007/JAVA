import java.util.Scanner;

public class Else_if_ladder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks =obj.nextInt();

        if(0<=marks && 35>marks){
            System.out.println("you are Faile");
        }

        else if (35<=marks && 55>marks) {
            System.out.println("you got B Grade");
        }

        else if (55<=marks && 75>marks) {
            System.out.println("you got B+ Grade");
        }

        else if (75<=marks && 85>marks) {
            System.out.println("you got A Grade");
        }

        else if (85<=marks && 100>marks) {
            System.out.println("you got A+ Grade");
        }

        else{
            System.out.println("You Entered Wrong");
        }

    }
}
