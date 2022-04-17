package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private GameNumber gameNumber;

    public Player() {
        this.gameNumber = new GameNumber(new ArrayList<>());
    }

    public void setNumber(String inputNumber) {
        String[] number = inputNumber.split("");
        this.gameNumber.setNumbers(number);
    }

    public List<Integer> getNumber() {
        return gameNumber.getNumbers();
    }

    public void initGameNumber() {
        this.gameNumber = new GameNumber(new ArrayList<>());
    }
}
