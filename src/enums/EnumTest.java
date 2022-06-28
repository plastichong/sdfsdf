package enums;

enum Level{ //열거형 상수
    LOW,
    MIDIUM,
    HIGH
}


public class EnumTest {

    public static void main(String[] args) {
    Level level = Level.HIGH;

    switch (level){

        case LOW:
            System.out.println("LOW level");
            break;
        case MIDIUM:
            System.out.println("MIDIUM level");
            break;
        case HIGH:
            System.out.println("HIGH level");
            break;
        default:
            System.out.println("level이 없습니다");
            break;
    }

    }
}
