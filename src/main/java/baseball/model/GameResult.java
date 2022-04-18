package baseball.model;

public class GameResult {
    private int ball;
    private int strike;
    private boolean gameStart;

    public GameResult() {
        initStrikeAndBall();
        this.gameStart = true;
    }

    public void initStrikeAndBall() {
        this.ball = 0;
        this.strike = 0;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public boolean isGameStart() {
        return gameStart;
    }

    public void setGameStart(boolean gameStart) {
        this.gameStart = gameStart;
    }

    public void plusStrike() {
        this.strike++;
    }

    public void plusBall() {
        this.ball++;
    }
}
