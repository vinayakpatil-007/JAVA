import java.util.Scanner;

public class Descending_order {

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Array ");
        
        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Elements Are :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j =i+1; j < a.length; j++) {
                if (a[i]<a[j]) {
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
        }

        System.out.println("Descending Order");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}