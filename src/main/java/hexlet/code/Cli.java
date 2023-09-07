package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void askName() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String greetings = String.format("Hello, %s!", username);
        System.out.println(greetings);
    }
}
