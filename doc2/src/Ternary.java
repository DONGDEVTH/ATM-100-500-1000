import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max;
        System.out.println("฿Amount 1 : 108");

        int n1 = 108;
        max = n1;
        System.out.println("฿Amount 2 : 1009");

        int n2 = 1009;
        max = (n2 > max)? n2 : max ;
        System.out.println("฿Amount 3 : 101");

        int n3 = 101;
        max = (n3 > max)? n3 : max;

        System.out.println("\n Max Amount : "+ max);
        scan.close();
    }
}
