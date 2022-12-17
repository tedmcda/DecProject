import java.io.*;
import java.util.Scanner;

public class Wallet {
    public static double getWalletBalance() throws FileNotFoundException {

        String path = ("src\\Wallet.txt");

        Scanner scanner = new Scanner(new File(path));

        String walletBalanceStr = scanner.nextLine();
        scanner.close();
        Double walletBalance = Double.parseDouble(walletBalanceStr);

        return(walletBalance);

    }

    public static void updateWalletBalance(double balance) {

        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(
                                new File("src\\Wallet.txt"))))) {
            out.println(balance);
            out.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}





