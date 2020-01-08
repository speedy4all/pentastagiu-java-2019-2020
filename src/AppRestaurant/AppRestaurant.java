package AppRestaurant;

public class AppRestaurant {
    public static void main(String[] args) {
        Restaurant fastFood1 = new Restaurant("FastEat", "fastfood") ;
        Menu fastFoodMenu = new Menu(15);
        fastFood1.addGuest(10);
        System.out.println("Income of " + fastFood1.getName() + " is: " + fastFood1.guestNumber * fastFoodMenu.price);
        fastFood1.addGuest(5);
        System.out.println("We have " + fastFood1.getGuestNumber() + " guests at the moment.");
        System.out.println("Income of restaurant is: " + fastFood1.guestNumber * fastFoodMenu.price);
        System.out.println("Taxes for " + fastFood1 + " are " + ((fastFood1.guestNumber*fastFoodMenu.price)*0.20));

        Restaurant vegetarian1 = new Restaurant("Sano", "vegetarian");
        Menu vegMenu= new Menu(20);
        vegetarian1.addGuest(25);
        System.out.println("We have " + vegetarian1.getGuestNumber() + " guests at the moment.");
        System.out.println("Income of restaurant is: " + vegetarian1.guestNumber * vegMenu.price);
        System.out.println("Taxes for " + vegetarian1 + " are " + ((vegetarian1.guestNumber*vegMenu.price)*0.20)*0.3);

        Restaurant vegetarian2 = new Restaurant("Vegan House" , "vegetarian");
        Menu vegMenu2 = new Menu(16);
        vegetarian2.addGuest(60);
        System.out.println("We have " + vegetarian2.getGuestNumber() + " guests at the moment.");
        System.out.println("Income of restaurant is: " + vegetarian2.guestNumber * vegMenu2.price);
        System.out.println("Taxes for " + vegetarian2 + " are " + ((vegetarian2.guestNumber*vegMenu2.price)*0.20)*0.3);

        //  vegetarian2.getIncome(); Am creat metoda asta, nu inteleg de ce imi da eroare :(  De aceea am facut asa problema.


    }
}
