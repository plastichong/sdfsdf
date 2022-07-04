package customer;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    public VIPCustomer( String customerName,int customerId, int agentId){
        super(customerName,customerId);
        this.agentId = agentId;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getAgentId() {
        return agentId;
    }


    @Override
    public int calcPrice(int price) {
        price -= (int)(price * saleRatio);
        bonusPoint += (int) (price * bonusRatio);

        return price;
//                super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" \n당담 상담원의 아이디는 "+agentId+" 입니다.";
    }

}
