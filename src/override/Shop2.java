package override;

public class Shop2 extends HeadShop{


    public Shop2(){
    System.out.println("역세권 매장입니다");
    };


    @Override
    public void sellBibimBop() {
        System.out.println("비빔밥: 7,500");

    }

    @Override
    public void sellDoenjangJJigae() {
        System.out.println("된장찌게: 7,500");

    }

    @Override
    public void sellKimchJJigae() {
        System.out.println("김치찌게: 7,500");
    }

}
