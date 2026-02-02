import java.util.Scanner;

public class Total_Average {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Marks of five Subjects :");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int e=obj.nextInt();

        int Total =a+b+c+d+e;

        float Average =Total/5;

        System.out.println("Total ="+Total);

        System.out.println("Average ="+Average);
    }
}
