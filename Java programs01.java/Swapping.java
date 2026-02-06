public class Swapping {
    public static void main(String[] args) {
        int a=10,b=20,t;
        System.out.println("a ="+a+" ,b ="+b);

        t=a;
        a=b;
        b=t;

        System.out.println("a ="+a+" ,b ="+b);

    }
}

// Swapping without using third variable

// public class Swapping {
//     public static void main(String[] args) {
//         int a=10,b=20,t;
//         System.out.println("a ="+a+" ,b ="+b);

//         a=a+b;
//         b=a-b;
//         a=a-b;

//         System.out.println("a ="+a+" ,b ="+b);
//     }

// }