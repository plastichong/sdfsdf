package customer;

public class Customer {
    private int customerId;
    private String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int calcPrice(int price) {
        bonusPoint += (int) (price * bonusRatio);
        //명시적 초기화를 안 했는데 0으로 초기화 됨
        return price;
    }

    public String showCustomerInfo() {
        return this.customerName + "님의 등급은 " + this.customerGrade +
                "이며, 보너스 포인트는" + this.bonusPoint + "점 입니다.";

    }

}
