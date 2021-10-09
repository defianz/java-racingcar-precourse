package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarNameTest {

    @Test
    public void 이름_5자이하_입력_성공() {
        //given
        String name = "안녕하세요";
        //when
        CarName carName = new CarName(name);
        //then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @Test
    public void 이름_5자초과_입력_실패() throws Exception {
        assertThatIllegalArgumentException().isThrownBy(() -> {
                    //given
                    String name = "안녕하세요6자";
                    //when
                    CarName carName = new CarName(name);
                }
        ).withMessage(Message.carNameErrorMessage);
    }
}
