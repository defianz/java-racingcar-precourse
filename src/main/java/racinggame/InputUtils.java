package racinggame;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class InputUtils {
    public static Cars inputCarName() {
        String inputObj = Console.readLine();
        String[] split = inputObj.split(",");
        return makeCars(asList(split));
    }

    public static TryNumber inputTryNumber() {
        String inputObj = Console.readLine();
        return new TryNumber(inputObj);
    }

    private static Cars makeCars(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName);
            carList.add(car);
        }
        return new Cars(carList);
    }
}
