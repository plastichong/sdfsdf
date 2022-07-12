package generic.product;


public class GenericProduct {
    public static void main(String[] args) {
        //<클래스,문자열> 타입
        Product<TV, String> prod1 = new Product<>();
        TV tv = new TV();
        prod1.setType(tv);
        prod1.setModel("smartTV");
        String tvModel = prod1.getModel();
        tv.making();
        System.out.println("모델 : "+tvModel);

        Product<Car, String> prod2 = new Product<>();
        Car car = new Car();
        prod2.setType(car);
        prod2.setModel("electricCar");
        String carModel = prod2.getModel();
        car.making();
        System.out.println("model : "+carModel);





    }
}
