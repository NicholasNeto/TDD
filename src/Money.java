
public abstract class Money {

    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multipler);

}
