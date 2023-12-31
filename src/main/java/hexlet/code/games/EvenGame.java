package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.GameData;

import java.util.Random;

public class EvenGame {
    private static final int START_RANGE_NUMBER = 1;
    private static final int END_RANGE_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static GameData getGameData() {
        Random random = new Random();
        GameData gameData = new GameData();

        for (int i = 0; i < Constants.QUESTION_COUNT; i++) {
            int randomNumber = random.nextInt(START_RANGE_NUMBER, END_RANGE_NUMBER);
            boolean numberIsEven = randomNumber % 2 == 0;

            gameData.questions[i] = String.format("Question: %d", randomNumber);
            gameData.answers[i] = numberIsEven ? "yes" : "no";
        }

        gameData.gameDescription = DESCRIPTION;

        return gameData;
    }
}
