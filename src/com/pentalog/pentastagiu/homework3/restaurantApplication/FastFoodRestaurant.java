package com.pentalog.pentastagiu.homework3.restaurantApplication;

public class FastFoodRestaurant extends Restaurant{

    private Double priceOfMenu;

    @Override
    public void displayTheMenu() {
        System.out.println("1 - CHICKEN SANDWICH\t 15 LEI\n2 - SOUP CHICKEN\t 18 LEI\n3 - NOODLES\t 17 LEI\n4 - CHEESBURGER\t 14 LEI\n5 - PIZZA WITH BACON AND CHEESE\t 22 LEI"
                + "\n6 - HOT DOG\t 11 LEI\n7 - CRISPY STRIPS\t 16 LEI\n8 - KEBAB \t 20 LEI");
    }

    public Double menu(Integer guestOrder) {
        switch(guestOrder) {
            case 1:
                priceOfMenu=FastFoodMenu.CHICKEN_SANDWICH.getMenuPrice();
                System.out.println("Guest ordered a CHICKEN SANDWICH\nPrice of order: " +  priceOfMenu + " LEI");
                break;
            case 2:
                priceOfMenu=FastFoodMenu.SOUP_CHICKEN.getMenuPrice();
                System.out.println("Guest ordered a SOUP CHICKEN\nPrice of order: " +  priceOfMenu +" LEI");
                break;
            case 3:
                priceOfMenu=FastFoodMenu.NOODLES.getMenuPrice();
                System.out.println("Guest ordered NOODLES\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 4:
                priceOfMenu=FastFoodMenu.CHEESBURGER.getMenuPrice();
                System.out.println("Guest ordered a CHEESBURGER\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 5:
                priceOfMenu=FastFoodMenu.PIZZA_BACON_CHEESE.getMenuPrice();
                System.out.println("Guest ordered a PIZZA WITH BACON AND CHEESE\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 6:
                priceOfMenu=FastFoodMenu.HOT_DOG.getMenuPrice();
                System.out.println("Guest ordered a HOT DOG\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 7:
                priceOfMenu=FastFoodMenu.CRISPY_STRIPS.getMenuPrice();
                System.out.println("Guest ordered  CRISPY STRIPS\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 8:
                priceOfMenu=FastFoodMenu.KEBAB.getMenuPrice();
                System.out.println("Guest ordered a KEBAB\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            default:
                System.out.println("The product choosed is not present in the menu");

        }
        return priceOfMenu;
    }

    @Override
    public Double calculatingTaxes(Double totalIncome) {
        Double taxFastFoodRestaurant=super.getPERCENT_TAXES_TO_PAY()*totalIncome;
        return taxFastFoodRestaurant;
    }
}
