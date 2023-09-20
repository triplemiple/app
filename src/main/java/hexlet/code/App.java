package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("""
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit""");
                Scanner sc = new Scanner(System.in);
                int gameNumber = sc.nextInt();
                System.out.printf("Your choice: %d%n", gameNumber);
                GameData gameData;

                switch (gameNumber) {
                    case 1 -> {
                        Cli.askName();
                        return;
                    }
                    case 2 -> gameData = EvenGame.getGameData();
                    case 3 -> gameData = CalcGame.getGameData();
                    case 4 -> gameData = GCDGame.getGameData();
                    case 5 -> gameData = ProgressionGame.getGameData();
                    case 6 -> gameData = PrimeGame.getGameData();
                    case 0 -> {
                        return;
                    }
                    default -> {
                        System.out.println(PrintUtils.getInvalidInputPrint());
                        continue;
                    }
                }

                String username = Cli.askName();
                Engine.startGame(username, gameData);
                return;
            } catch (Exception e) {
                System.out.println(PrintUtils.getInvalidInputPrint());
            }
        }
    }
}
