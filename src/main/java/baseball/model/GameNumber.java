package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameNumber {
    public final static int NUMBER_SIZE = 3;
    private final static int MIN_RANGE = 0;
    private final static int MAX_RANGE = 9;
    private List<Integer> numbers;

    public GameNumber() {
        this.numbers = pickNumbers();
    }

    public GameNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> pickNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        while(randomNumbers.size() < NUMBER_SIZE) {
            int number = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
            if(!randomNumbers.contains(number)) {
                randomNumbers.add(number);
            }
        }
        return randomNumbers;
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
