public class logical_Operator {
    public static void main(String[] args) {
        System.out.println("AND operator :");
        System.out.println((5<10) && (10<15));
        System.out.println((5<10)&& (10<5));
        System.out.println((10<5) && (15<10));

        System.out.println("OR operator :");
        System.out.println((5<10) || (10<15));
        System.out.println((5<10)|| (10<5));
        System.out.println((10<5) || (15<10));

        System.out.println("NOT operator :");
        System.out.println(!((5<10) && (10<15)));
        System.out.println(!((5<10) && (10<5)));
        System.out.println(!((10<5) && (15<10)));
    }
}
