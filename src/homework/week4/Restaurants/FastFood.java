package homework.week4.Restaurants;

public class FastFood extends Restaurant {

    public FastFood(String nume) {
        super(nume);
    }

    @Override
    public double payTaxes() {
        return getIncome() - getIncome()*(20.0/100);
    }

}
