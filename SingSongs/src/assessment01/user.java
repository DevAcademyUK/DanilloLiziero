package assessment01;

public class user {
    private String name;
    private int pin;
    public double currentBalance;
    public double savingsBalance;
    public double jointBalance;

    public user(String name, int pin, double currentBalance, double savingsBalance, double jointBalance) {
        this.name = name;
        this.pin = pin;
        this.currentBalance = currentBalance;
        this.savingsBalance = savingsBalance;
        this.jointBalance = jointBalance;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }
}
