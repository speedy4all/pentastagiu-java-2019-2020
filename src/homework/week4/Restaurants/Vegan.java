package homework.week4.Restaurants;

public class Vegan extends Restaurant {

    public Vegan(String name) {
        super(name);
    }

    @Override
    public double payTaxes() {
        double tax = getIncome()*(20.0/100);
        return getIncome() - (tax - tax*30.0/100);
    }


}
