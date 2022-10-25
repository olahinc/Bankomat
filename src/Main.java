import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int account;
        account=5000;
        System.out.print("Ile chcesz wypłacić gotówki? [zł]:");
        int cash=sc.nextInt();
        System.out.print("Wypłacasz [zł]: " +cash+ "\n" + "Stan konta po wypłacie [zł]: " + (account - cash));
    }
}