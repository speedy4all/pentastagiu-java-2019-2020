package myHomeWork.week3.shop;

public class ShopApp {
    public static void main(String[] args) {

        //Customer.MemberShip membership = Customer.MemberShip.GOLD;
        Customer customer = new Customer(1, "Ion", Customer.MemberShip.GOLD);
        System.out.println(customer);
        Product book1 = new Book(1, "The secret of succes", 142.3f, "Dale Carnegie");
        Product candy1 = new Candy(2, "Bucuria", 54.3f, 500);
        System.out.println(book1);
        System.out.println(candy1);
        Basket basket = new Basket(customer);
        System.out.println(basket);
        basket.add(book1);
        System.out.println(basket);
        basket.add(candy1);
        System.out.println(basket);
        basket.getDiscountInfo();
        System.out.println("\n    <<<<<After changes the membership of the customer>>>>>");
        customer.setMemberShip(Customer.MemberShip.SILVER);
        System.out.println(basket);
        basket.applyDiscount();
        basket.getDiscountInfo();






    }
}
