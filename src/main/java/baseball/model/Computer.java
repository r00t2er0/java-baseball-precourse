package baseball.model;

import java.util.List;

public class Computer extends Player{
    private GameNumber gameNumber;

    public Computer() {
        this.gameNumber = new GameNumber();
    }

    @Override
    public List<Integer> getNumber() {
        return gameNumber.getNumbers();
    }

    @Override
    public void setNumber(String inputNumber) {
        super.setNumber(inputNumber);
    }
}
