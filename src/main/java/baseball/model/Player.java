package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private GameNumber gameNumber;

    public Player() {
        initGameNumber();
    }

    public void initGameNumber() {
        this.gameNumber = new GameNumber(new ArrayList<>());
    }

    public void setNumber(String inputNumber) {
        this.gameNumber.setNumbers(inputNumber);
    }

    public List<Integer> getNumber() {
        return gameNumber.getNumbers();
    }
}
