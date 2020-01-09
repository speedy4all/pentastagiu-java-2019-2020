package com.pentalog.pentastagiu.homework3.restaurantApplication;

public class VegetarianRestaurant extends Restaurant{
    private Double priceOfMenu;
    private final Double TAX_DISCOUNT=0.30;


    @Override
    public void displayTheMenu() {
        System.out.println("1 - VEGETARIAN PIZZA\t 25 LEI\n2 - ORIENTAL SALAD\t 25 LEI\n3 - FRIED RICE WITH VEGETABLES\t 18 LEI\n4 - AUTUMN SALAD\t 16 LEI\n5 - TOMATO SOUP\t 17 LEI"
                + "\n6 - STRAWBERRY CAKE\t 13 LEI\n7 - SALAD WITH BEET, MUSHROOMS AND AVOCADO\t 15 LEI \n8 - VEGETABLE LASAGNA \t 23 LEI");
    }

    public Double menu(Integer guestOrder) {
        switch(guestOrder) {
            case 1:
                priceOfMenu=VegetarianMenu.VEGETARIAN_PIZZA.getMenuPrice();
                System.out.println("Guest ordered a VEGETARIAN PIZZA\nPrice of order: " +  priceOfMenu + " LEI");
                break;
            case 2:
                priceOfMenu=VegetarianMenu.ORIENTAL_SALAD.getMenuPrice();
                System.out.println("Guest ordered a ORIENTAL SALAD\nPrice of order: " +  priceOfMenu +" LEI");
                break;
            case 3:
                priceOfMenu=VegetarianMenu.FRIED_RICE_WITH_VEGETABLES.getMenuPrice();
                System.out.println("Guest ordered FRIED RICE WITH VEGETABLES\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 4:
                priceOfMenu=VegetarianMenu.AUTUMN_SALAD.getMenuPrice();
                System.out.println("Guest ordered an AUTUMN SALAD\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 5:
                priceOfMenu=VegetarianMenu.TOMATO_SOUP.getMenuPrice();
                System.out.println("Guest ordered a TOMATO SOUP\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 6:
                priceOfMenu=VegetarianMenu.STRAWBERRY_CAKE.getMenuPrice();
                System.out.println("Guest ordered a STRAWBERRY CAKE\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 7:
                priceOfMenu=VegetarianMenu.BEET_MUSHROOM_AVOCADO_SALAD.getMenuPrice();
                System.out.println("Guest ordered  a SALAD WITH BEET, MUSHROOMS AND AVOCADO_\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            case 8:
                priceOfMenu=VegetarianMenu.VEGETABLE_LASAGNA.getMenuPrice();
                System.out.println("Guest ordered a VEGETABLE LASAGNA\nPrice of order: " +  priceOfMenu+" LEI");
                break;
            default:
                System.out.println("The product choosed is not present in the menu");

        }
        return priceOfMenu;
    }

    @Override
    public Double calculatingTaxes(Double totalIncome) {
        Double taxVegetarianRestaurant=(super.getPERCENT_TAXES_TO_PAY()*totalIncome) - this.TAX_DISCOUNT*(super.getPERCENT_TAXES_TO_PAY()*totalIncome);
        return taxVegetarianRestaurant;
    }

    public Double getTAX_DISCOUNT() {
        return TAX_DISCOUNT;
    }

}
