package baseball;

import baseball.model.Computer;
import baseball.model.GameNumber;
import baseball.model.GameResult;
import baseball.model.Player;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();

        while(true) {
            inputNumber(player);
            int result = compareGameNumber(player.getNumber(), computer.getNumber());
            player.initGameNumber();

            if(result == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int selectNumber = Integer.parseInt(Console.readLine());
                if(selectNumber == 2) {
                    break;
                }
                computer = new Computer();
            }
        }
    }

    public static void inputNumber(Player player) {
        System.out.printf("숫자를 입력해주세요: ");
        player.setNumber(Console.readLine());
    }

    public static int compareGameNumber(List<Integer> playerNumber, List<Integer> computerNumber) {
        GameResult gameResult = new GameResult();
        for(int i=0; i<GameNumber.NUMBER_SIZE; i++) {
            includeNumber(playerNumber, computerNumber, gameResult, i);
        }
        printResult(gameResult.getBall(), gameResult.getStrike());

        return gameResult.getStrike();
    }

    public static void includeNumber(
            List<Integer> playerNumber,
            List<Integer> computerNumber,
            GameResult gameResult,
            int i
    ) {
        if(playerNumber.contains(computerNumber.get(i))) {
            calculateGameNumber(playerNumber.get(i), computerNumber.get(i), gameResult);
        }
    }

    public static boolean calculateGameNumber(int playerNumber, int computerNumber, GameResult gameResult) {
        if(playerNumber == computerNumber) {
            gameResult.plusStrike();
            return true;
        }
        gameResult.plusBall();
        return false;
    }

    public static boolean printResult(int ball, int strike) {
        if(strike == 0 && ball == 0) {
            System.out.println("낫싱");
            return true;
        }
        System.out.println(ball + "볼 " + strike + "스트라이크");
        return false;
    }
}
