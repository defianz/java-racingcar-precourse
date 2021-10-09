package racinggame;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void play() {
        for (Car car : carList) {
            car.play(CarMoveCondition.isStatus());
        }
    }

    public List<Car> getWinners() {
        int maxPosition = getWinnerPosition();
        return carList.stream()
                .filter(car -> car.getPosition().getValue() == maxPosition)
                .collect(Collectors.toList());
    }

    private int getWinnerPosition() {
        int winnerPosition = 0;
        for (Car car : carList) {
            winnerPosition = Math.max(car.getPosition().getValue(), winnerPosition);
        }
        return winnerPosition;
    }

    public void printResult() {
        for (Car car : carList) {
            OutputUtils.printCarName(car);
            OutputUtils.printCarPosition(car);
        }
        System.out.println();
    }
}
