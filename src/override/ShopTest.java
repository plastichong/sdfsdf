package override;

public class ShopTest {
    public static void main(String[] args) {
        Shop1 shop1 = new Shop1();

        shop1.sellBibimBop();
        shop1.sellKimchJJigae();
        shop1.sellDoenjangJJigae();

        Shop2 shop2 = new Shop2();

        shop2.sellBibimBop();
        shop2.sellKimchJJigae();
        shop2.sellDoenjangJJigae();

        HeadShop headShop = new HeadShop();
        headShop.sellBibimBop();
        headShop.sellKimchJJigae();
        headShop.sellDoenjangJJigae();
    }
}
