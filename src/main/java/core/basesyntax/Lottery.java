package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(FIGURE_COUNT));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
