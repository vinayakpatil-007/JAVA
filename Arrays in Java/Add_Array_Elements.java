import java.util.Scanner;

public class Add_Array_Elements {
    public static void main(String[] args) {
        int a[]=new  int[5],sum=0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Array Elements :");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
            sum+=a[i];
        }

        // for (int i = 0; i < a.length; i++) {
        //     sum+=a[i];
        // }
        System.out.println("sum ="+sum);

    }
    
}
