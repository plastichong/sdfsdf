package customer;

public class GoldCustomer extends Customer{
    double saleRatio;
    public GoldCustomer() {
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public GoldCustomer(String customerName, int customerId) {
        super(customerName,customerId);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
    }

    public int calcPrice(int price) {
        price -= (int)(price * saleRatio);
        bonusPoint += (int) (price * bonusRatio);
        return price;
    }
}
