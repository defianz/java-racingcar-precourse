package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void 자동차생성테스트() throws Exception {
        // given
        String name = "안녕하세요";
        //when
        Car car = new Car(name);
        //then
        assertThat(car.getCarName().getName()).isEqualTo(name);
        assertThat(car.getPosition().getValue()).isEqualTo(0);
    }

    @Test
    public void 자동차전진_성공() throws Exception {
        //given
        String name = "안녕하세요";
        //when
        Car car = new Car(name);
        car.play(CarStatus.MOVE);
        //then
        assertThat(car.getPosition().getValue()).isEqualTo(1);
    }

    @Test
    public void 자동차전진_실패() throws Exception {
        //given
        String name = "안녕하세요";
        //when
        Car car = new Car(name);
        car.play(CarStatus.STOP);
        //then
        assertThat(car.getPosition().getValue()).isEqualTo(0);
    }

}
