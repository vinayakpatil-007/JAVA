import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 4 Subjects: ");
        a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double average = (a+b+c+d)/4;
        System.out.println("Average = "+ average);

    }
}
