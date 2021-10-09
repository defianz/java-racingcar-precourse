package racinggame;

import nextstep.utils.Console;

import java.util.List;

import static java.util.Arrays.asList;

public class InputUtils {
    public static List<String> inputCarName(){
        String inputObj = Console.readLine();
        String[] split = inputObj.split(",");
        return asList(split);
    }

    public static TryNumber inputTryNumber(){
        String inputObj = Console.readLine();
        return new TryNumber(inputObj);
    }
}
