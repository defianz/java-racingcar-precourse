package racinggame;

public class Car implements Comparable<Car> {

    private final CarName carName;
    private final Position position;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.position = new Position();
    }

    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }

    public void play(CarStatus move) {
        if (move == CarStatus.MOVE) position.addPosition();
    }

    @Override
    public int compareTo(Car o) {
        return this.position.getValue() - o.getPosition().getValue();
    }
}
