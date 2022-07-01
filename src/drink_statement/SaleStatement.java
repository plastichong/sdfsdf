package drink_statement;

public class SaleStatement {
    public static void main(String[] args) {

        Drink coffee = new Drink("커피",2500,10);
        coffee.ptrintTitle();
        coffee.printData();
        Drink greenTea = new Drink("녹차",3000,4);
        greenTea.printData();
        Alcohol soju = new Alcohol("소주",4000,5,15.4f);
        soju.ptrintTitle();
        soju.printData();

        int sum = coffee.getTotalPrice()+ greenTea.getTotalPrice()+ soju.getTotalPrice();
        System.out.println("\n***** 합계 금액"+sum+"원 *****");

    }

}
