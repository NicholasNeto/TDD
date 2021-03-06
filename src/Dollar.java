

public class Dollar extends Money{

    private String currency;

    public Dollar (int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
