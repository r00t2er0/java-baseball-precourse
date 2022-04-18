package baseball.model;

public class GameResult {
    private int strike;
    private int ball;

    public GameResult() {
        this.strike = 0;
        this.ball = 0;
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

    public void plusStrike() {
        this.strike++;
    }

    public void plusBall() {
        this.ball++;
    }
}
