package override;

public class Shop1 extends HeadShop {

    public Shop1() {
        System.out.println("대학가 매장입니다.");
    }

    ;

    @Override
    public void sellBibimBop() {
        System.out.println("비빔밥: 5,500");

    }

    @Override
    public void sellDoenjangJJigae() {
        System.out.println("된장찌게: 5,500");

    }

    @Override
    public void sellKimchJJigae() {
        System.out.println("김치찌게: 5,500");
    }
}
