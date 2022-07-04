package customer;

import java.util.ArrayList;

public class CustomerList {
    public static void main(String[] args) {
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        //실버 2명 골드 2명 VIP1명
        Customer wee = new Customer("위수영", 1);
        Customer wee2 = new Customer("위수영2", 2);

        GoldCustomer lim = new GoldCustomer("임준영", 1);//가능
        Customer lim2 = new GoldCustomer("임준영2", 2);

        Customer son = new VIPCustomer("손홍훈", 1, 1);

        CustomerList.add(wee);
        CustomerList.add(wee2);
        CustomerList.add(lim);
        CustomerList.add(lim2);
        CustomerList.add(son);


        int price = 10000;

        for (Customer customer : CustomerList) {
            customer.calcPrice(price);
            System.out.println(customer.getCustomerName()
                    + " 님이" + customer.calcPrice(price) + " 원 지불하셨습니다.");
        }


        for (int i = 0; i < CustomerList.size(); i++) {
            Customer customer = CustomerList.get(i);
            System.out.println(customer.showCustomerInfo());
        }


    }
}
