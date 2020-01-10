import java.util.Scanner;

public class AtmBankNotes {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Total Money: ");
        int withdraw = scan.nextInt();
        int b1000 = (int)(withdraw / 1000);

        int remain = withdraw % 1000;
        int b500 = (int) (remain / 500);

        remain = remain % 500;
        int b100 = (int) (remain / 100);

        System.out.println("Type BankNotes:");
        System.out.println("฿1000: " + b1000);
        System.out.println("฿500ซ " + b500);
        System.out.println("฿500ซ " + b100);
        scan.close();
    }
}