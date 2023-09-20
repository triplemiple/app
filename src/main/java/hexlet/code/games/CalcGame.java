package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.GameData;

import java.util.Random;

public class CalcGame {

    private static final int START_RANGE_NUMBER = 0;
    private static final int END_RANGE_NUMBER = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static GameData getGameData() {
        Random random = new Random();
        GameData gameData = new GameData();

        for (int i = 0; i < Constants.QUESTION_COUNT; i++) {
            int firstNumber = random.nextInt(START_RANGE_NUMBER, END_RANGE_NUMBER);
            int secondNumber = random.nextInt(START_RANGE_NUMBER, END_RANGE_NUMBER);
            String operation = OPERATIONS[random.nextInt(3)];

            gameData.questions[i] = String.format("Question: %d %s %d", firstNumber, operation, secondNumber);

            switch (operation) {
                case "+" -> gameData.answers[i] = Integer.toString(firstNumber + secondNumber);
                case "-" -> gameData.answers[i] = Integer.toString(firstNumber - secondNumber);
                case "*" -> gameData.answers[i] = Integer.toString(firstNumber * secondNumber);
                default -> throw new IllegalArgumentException(
                        String.format("No compute action for operation '%s'", operation));
            }
        }

        gameData.gameDescription = DESCRIPTION;

        return gameData;
    }
}
