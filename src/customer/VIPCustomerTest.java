package customer;

public class VIPCustomerTest {
    public static void main(String[] args) {
       VIPCustomer lim = new VIPCustomer();
        lim.setCustomerName("임준영");
        lim.setAgentId(1234);

        int price = 10000;
        int price2 = 20000;

        lim.calcPrice(price);

        System.out.println(lim.showCustomerInfo());
    }
}
