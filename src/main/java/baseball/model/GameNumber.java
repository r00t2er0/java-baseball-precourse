package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class GameNumber {
    private final static int NUMBER_SIZE = 3;
    private List<Integer> numbers;

    public GameNumber() {
        this.numbers = Randoms.pickUniqueNumbersInRange(0,9,3);
    }

    public GameNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(String inputNumber) {
        validateSize(inputNumber);
        String[] numbers = inputNumber.split("");
        for(String number : numbers) {
            this.numbers.add(Integer.parseInt(number));
        }
    }

    public void validateSize(String number) {
        if(number.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
