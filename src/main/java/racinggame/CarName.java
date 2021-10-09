package racinggame;

public class CarName {

    private final String name;

    public CarName(String name) {
        validateCarName(name);
        this.name = name;
    }

    private void validateCarName(String name) {
        if (name.length() > 5) throw new IllegalArgumentException(Message.errorCarNameMessage);
    }

    public String getName() {
        return name;
    }
}
