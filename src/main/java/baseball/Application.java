package baseball;

import baseball.model.Computer;
import baseball.model.Player;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Player player = new Player();
        Computer computer = new Computer();

        while(true) {
            System.out.printf("숫자를 입력해주세요: ");
            player.setNumber(Console.readLine());
        }
    }
}
