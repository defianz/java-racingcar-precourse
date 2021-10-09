package racinggame;

public class TryNumber {
    private final int tryNumber;

    public TryNumber(String tryNumber) {
        validateTryNumber(tryNumber);
        int validatedTryNumber = Integer.parseInt(tryNumber);
        this.tryNumber = validatedTryNumber;
    }

    private void validateTryNumber(String tryNumber) {
        String REGEX = "^[0-9]*$";
        if (!tryNumber.matches(REGEX)) new IllegalArgumentException(Message.errorTryNumberMessage);
    }

    public int getTryNumber() {
        return tryNumber;
    }
}
