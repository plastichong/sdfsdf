package singleton.car;

public class Car {
    //차의 고유번호를 증가

    private int carNum;

    private static int seralNum = 10000;
    public Car(){
        seralNum++;
        carNum = seralNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
