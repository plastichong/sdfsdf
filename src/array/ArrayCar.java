package array;

public class ArrayCar {
    public static void main(String[] args) {

//        String[] cars = new String[4];
//        cars[0] = "morning";
//        cars[1] = "sonata";
//        cars[2] = "sportage";
//        cars[3] = "k7";

        String[] cars = {"morning","sonata","sportage","k7" };
        cars[2] = "bmw";

        for (int i = 0; i< cars.length;i++){
            System.out.print(cars[i]+",");
        }
        System.out.println();
        for (String car : cars){
            System.out.print(car+" ");
        }
    }
}
