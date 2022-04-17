package baseball;

import baseball.model.Computer;
import baseball.model.GameNumber;
import baseball.model.Player;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Player player = new Player();
        Computer computer = new Computer();

        while(true) {
            int strike = 0;
            int ball = 0;

            System.out.printf("숫자를 입력해주세요: ");
            player.setNumber(Console.readLine());

            for(int i=0; i<GameNumber.NUMBER_SIZE; i++) {
                if(player.getNumber().contains(computer.getNumber().get(i))) {
                    if(player.getNumber().get(i).equals(computer.getNumber().get(i))) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }

            if(strike == 0 && ball == 0) {
                System.out.println("낫싱");
            } else {
                System.out.println(ball + "볼 " + strike + "스트라이크");
            }

            player.initGameNumber();
        }
    }
}
