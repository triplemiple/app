package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("""
                        Please enter the game number and press Enter.
                        1 - Greet
                        0 - Exit""");
                Scanner sc = new Scanner(System.in);
                int gameNumber = sc.nextInt();
                System.out.printf("Your choice: %d%n", gameNumber);

                switch (gameNumber) {
                    case 1 -> {
                        System.out.println("Welcome to the Brain Games!");
                        Cli.askName();
                        return;
                    }
                    case 0 -> {
                        return;
                    }
                }
            } catch (Exception e) {
                //ignored
            }
        }
    }
}
