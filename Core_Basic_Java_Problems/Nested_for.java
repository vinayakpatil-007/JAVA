import java.util.Scanner;

public class Nested_for {
    public static void main(String[] args) {
        int i,j,row,column;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter row Numbers :");
        row=obj.nextInt();
        System.out.println("Enter column Numbers :");
        column=obj.nextInt();

        for(i=1;i<=row;i++){
            for(j=1;j<=column;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
