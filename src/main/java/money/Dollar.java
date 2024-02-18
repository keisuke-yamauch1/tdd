package money;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return "USD";
    }
}

