import java.util.Scanner;

public class ATM {
        public static  void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Total Money: 10000");
            int w = scan.nextInt();
            int b1000 = (int)(w / 1000);

            int r= w % 1000;
            int b500 = (int)(r / 500);

            r = r % 500;
            int b100 = (int)(r / 100);

            System.out.println("Type BankNotes:");
            System.out.println("฿1000: " + b1000);
            System.out.println("฿500: " + b500);
            System.out.println("฿500: " + b100);
            scan.close();
        }
}