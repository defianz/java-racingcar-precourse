package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class CarsTest {

    @Test
    public void Winner_가져오기() throws Exception {
        //given
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");
        List<Car> carList = asList(car1, car2, car3);
        //when
        Cars cars = new Cars(carList);
        cars.play();
        //then
        Assertions.assertThat(cars.getWinners()).hasSizeGreaterThanOrEqualTo(1);
    }

    @Test
    public void 출력하기() throws Exception {
        //given
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        List<Car> carList = asList(car1, car2);
        //when
        Cars cars = new Cars(carList);
        cars.play();
        //then
        cars.printResult();
    }
}
