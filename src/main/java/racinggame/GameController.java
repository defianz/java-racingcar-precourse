package racinggame;

public class GameController {

    private TryNumber tryNumber;

    public void playGame() {
        try {
            OutputUtils.inputCarName();
            Cars cars = InputUtils.inputCarName();
            OutputUtils.inputTryNumber();
            tryNumber = InputUtils.inputTryNumber();
            raceStart(cars);
            OutputUtils.finalWinner(cars.getWinners());
        } catch (IllegalArgumentException e) {
            OutputUtils.printString(e.getMessage());
            playGame();
        }
    }

    private void raceStart(Cars cars) {
        OutputUtils.printLine();
        OutputUtils.tryResultHeader();
        for (int i = 0; i < tryNumber.getTryNumber(); i++) {
            cars.play();
            cars.printResult();
        }
    }
}
