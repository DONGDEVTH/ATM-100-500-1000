import java.util.Scanner;

public class Termary_Operator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 108;
        int min;
        System.out.print("Number 1 >> ");
        int n1 = scan.nextInt();
        min = n1;

        int n2 = 1009;
        System.out.print("Number 2 >> ");
        int n2 = scan.nextInt();
        if(n2 < min) {
            min = n2;
        }
        int n3 = 101;
        System.out.print("Number 3 >> ");
        int n3 = scan.nextInt();
        if (n3 < min) {
            min = n3;
        }
        System.out.println("\n Min Number is : " + min);
        scan.close();
    }
}
