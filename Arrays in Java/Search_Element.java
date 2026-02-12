import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        int a[]= new int[5],n,count=0;
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Elements of Array :");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Array Elements Are :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter Search Element :");
        n=obj.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (n==a[i]) {
                System.out.println("Element "+a[i]+" at "+i+" index");
                count+=1;
            }
        }

        if (count==0) {
            System.out.println("Element Not Found");
        }

    }
}
