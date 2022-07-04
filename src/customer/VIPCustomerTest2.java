package customer;

public class VIPCustomerTest2 {
    public static void main(String[] args) {
        Customer wee = new Customer("위수영",1234);
//       VIPCustomer lim = new VIPCustomer("임준영",1234,1234);
        Customer lim = new VIPCustomer("임준영",1234,1234);

        int price = 10000;

        int limPrice = lim.calcPrice(price);
        System.out.println(lim.showCustomerInfo());
        System.out.println(limPrice);

        int weePrice = wee.calcPrice(price);
        System.out.println(wee.showCustomerInfo());
        System.out.println(weePrice);

    }
}
