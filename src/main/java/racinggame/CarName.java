package racinggame;

public class CarName {

    private final String name;

    public CarName(String name) {
        if(name.length() > 5) throw new IllegalArgumentException(Message.carNameErrorMessage);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
