import java.util.Scanner;

public class Biggest_Element {
    public static void main(String[] args) {
        int a[]=new int[5],max=0;
        Scanner obj =new Scanner(System.in);

        System.out.println("Enter Elements of Array :");
        
        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }

        System.out.println("Maximum number is :"+max);
    }
}
