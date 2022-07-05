package polymorphism.tire;

public class Tire {

    int maxRotation;
    int accumulatedRotation;
    String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public Tire(int maxRotation) {
        this.maxRotation = maxRotation;
    }

    public Tire(String location) {
        this.location = location;
    }


    public boolean roll() {

        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
//            System.out.println(location + " 타이어수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else if (maxRotation - accumulatedRotation == 0) {
            System.out.println("*** " + location + " 타이어 펑크!!***");
            return false;
        }else {

        return false;
        }
    }




}


