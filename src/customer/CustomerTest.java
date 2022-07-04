package customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer wee = new Customer();

        wee.setCustomerName("위수영");
        System.out.println(wee.showCustomerInfo());

        int price = 10000;
        int price2 = 150000;

        wee.calcPrice(price);

        System.out.println(wee.showCustomerInfo());

        wee.calcPrice(price2);

        System.out.println(wee.showCustomerInfo());

    }
}
