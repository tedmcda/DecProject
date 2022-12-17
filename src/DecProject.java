import java.awt.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.*;


public class DecProject {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi and welcome to Ted's El Restorante!");
        System.out.println("I'm Ted and owner of this here restorante. I'll take your order. Oh, but first I need a name for your order.");
        String name = "";

        do {
            System.out.print("What's your name? ");
            name = sc.nextLine();
        }
        while (name.isBlank());
        System.out.println("Great, let's get your order started " + name + ".");

        System.out.println("Do you need a minute? y/n.");

        String response = sc.next();
        while (true) {
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Sounds good, I will come back in a few minutes.");
                TimeUnit.SECONDS.sleep(4);
                System.out.print("How's about now senor, do you still need a minute? ");
                response = sc.next();
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Great " + name + ", how can I get you started?");
                TimeUnit.SECONDS.sleep(2);
                break;
            } else {
                System.out.println("No, seriously, do you need a minute? ");
                response = sc.next();
            }
        }
        Specials special = Specials.BREAKFAST;
        if (special == Specials.BREAKFAST) {

            System.out.println(name + ": Ummmm.....I'll have your " + special + ".");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("Great! Our world famous pancakes, bacon, 2 eggs, toast, and coffee.");
        }
        System.out.println("Cream and Sugar with your coffee? y/n");
        TimeUnit.SECONDS.sleep(2);

        String response1 = sc.next();
        while (true) {
            if (response1.equalsIgnoreCase("Y")) {
                System.out.println("Great, here you are.");
                break;

            } else if (response1.equalsIgnoreCase("N")) {
                System.out.println("Okay, black it is.");
                break;
            }
        }
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Can I get you anything else? y/n");

        String response2 = sc.next();
        while (true) {
            if (response2.equalsIgnoreCase("Y")) {
                System.out.println("Refill on la casa.");
                break;

            } else if (response2.equalsIgnoreCase("N")) {
                System.out.println("I'm going to leave your bill with you, no rush.");
                break;
            }
        }
        Double t = 0.07;
        Double b = 13.89;
        Double a = b * t;
        Double c = a + b;

        TimeUnit.SECONDS.sleep(3);
        System.out.println(name + ": Wow, that was a great breakfast, my bill is only " + b + " too!");
        System.out.println(name + ": But wait, I need to add tax and tip.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(name + ": So 7%....My tax is only: " + currencyFormatter.format(a));
        TimeUnit.SECONDS.sleep(2);
        System.out.println(name + ": My total without tip is only: " + currencyFormatter.format(a + b));
        TimeUnit.SECONDS.sleep(3);
        System.out.println(name + ": Okay, let's add a tip. What are my options?");

        JFrame frame = new JFrame();
        frame.setSize(1000, 400);
        frame.setTitle("Tip Options");
        Container cont = frame.getContentPane();
        frame.setResizable(false);
        frame.setVisible(true);

        JButton jbutton1 = new JButton("10%");
        jbutton1.setSize(200, 100);
        jbutton1.setLocation(100, 150);
        jbutton1.setEnabled(true);
        cont.add(jbutton1);
        jbutton1.addActionListener((e) -> System.out.println(currencyFormatter.format((c * 0.10) + c)));

        JButton jbutton2 = new JButton("15%");
        jbutton2.setSize(200, 100);
        jbutton2.setLocation(300, 150);
        jbutton2.setEnabled(true);
        cont.add(jbutton2);
        jbutton2.addActionListener((e) -> System.out.println(currencyFormatter.format((c * 0.15) + c)));

        JButton jbutton3 = new JButton("20%");
        jbutton3.setSize(200, 100);
        jbutton3.setLocation(500, 150);
        jbutton3.setEnabled(true);
        cont.add(jbutton3);
        jbutton3.addActionListener((e) -> System.out.println(currencyFormatter.format((c * 0.20) + c)));

        JButton jbutton4 = new JButton("25%");
        jbutton4.setSize(200, 100);
        jbutton4.setLocation(700, 150);
        jbutton4.setEnabled(true);
        cont.add(jbutton4);
        jbutton4.addActionListener((e) -> System.out.println(currencyFormatter.format((c * 0.25) + c)));


        TimeUnit.SECONDS.sleep(6);
        System.out.println(name + ": Okay, let's make it 25%, he was really good.");

        double balance = Wallet.getWalletBalance();

        double f = 18.58;

        balance = balance - f;

        Wallet.updateWalletBalance(balance);
    }
}








