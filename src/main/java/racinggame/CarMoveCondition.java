package racinggame;

import nextstep.utils.Randoms;

public class CarMoveCondition {
    public static CarStatus isStatus(){
        return Randoms.pickNumberInRange(0,9) >= 4 ? CarStatus.MOVE : CarStatus.STOP;
    }
}
