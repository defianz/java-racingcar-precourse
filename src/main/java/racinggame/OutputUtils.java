package racinggame;

import java.util.List;

public class OutputUtils {

    public static void InputRequest() {
        System.out.println(Message.inputCarNameReqeustMessage);
    }

    public static void inputTryNumber() {
        System.out.println(Message.inputTryNumberRequestMessage);
    }

    public static void tryResultHeader() {
        System.out.println(Message.tryResultHeader);
    }

    public static void finalWinner(List<Car> cars) {
        String winners = listToString(cars);
        System.out.println(
                String.format(Message.finalWinnerMessage, winners)
        );
    }

    public static void printCarPosition(Car car) {
        for (int i = 0; i < car.getPosition().getValue(); i++) {
            System.out.print(Message.positionProgressImage);
        }
        System.out.println();
    }

    public static void printCarName(Car car) {
        System.out.print(car.getCarName().getName() + " : ");
    }

    private static String listToString(List<Car> cars) {
        if (cars.size() == 1) return cars.get(0).getCarName().getName();
        StringBuilder sb = new StringBuilder();
        for (Car winner : cars) {
            sb.append(winner.getCarName());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length());
        return sb.toString();
    }
}
