import java.util.Scanner;

public class Tax_on_Salary {

    public static void main(String[] args) {
        int salary;
        float tax;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Salary :");
        salary=obj.nextInt();

        if (10000>salary) {
            System.out.println("No tax on below 10,000 salary");
        }

        else if (100000 > salary && 10000<=salary) {
            tax = salary*0.07f;
            System.out.println("Tax ="+ tax);
        }

        else{
            tax = salary*0.12f;
            System.out.println("Tax ="+tax);
        }
    }
}