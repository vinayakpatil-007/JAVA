import java.util.Scanner;

public class Average_of_Array {
    public static void main(String[] args) {
        int a[]= new int[5],sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array Elements");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum +=a[i];
        }
        System.out.println("Average ="+(sum/5));

    }
}
