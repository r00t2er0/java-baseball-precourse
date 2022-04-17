package baseball.model;

import java.util.List;

public class Player {
    private GameNumber gameNumber;

    public void setNumber(GameNumber gameNumber) {
        this.gameNumber = gameNumber;
    }

    public List<Integer> getNumber() {
        return gameNumber.getNumbers();
    }

}
