package homework2.problem2;

public enum Membership {
    GOLD(50),
    SILVER(10),
    NO_MEMBERSHIP(0);

    private final int discount;
    Membership(int discount){
        this.discount = discount;
    }

    public double calculateDiscount(double value){
        if (value <= 0){
            throw new IllegalArgumentException();
        }
        return value - ((value*discount)/100);
    }
}
