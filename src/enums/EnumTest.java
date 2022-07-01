package enums;

enum Level { //열거형 상수
    LOW,
    MIDIUM,
    HIGH
}


public class EnumTest {

    public static void main(String[] args) {
        Level level = Level.HIGH;

        switch (level) {

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

        LoginResultEnum result = LoginResultEnum.FAIL_ID;

        if (result == LoginResultEnum.SUCCESS) {
            System.out.println("로그인 성공");
        } else if (result == LoginResultEnum.FAIL_ID) {
            System.out.println("로그인 실패 ID 오류");
        } else if (result == LoginResultEnum.FAIL_PASSWORD) {
            System.out.println("로그인 실패 PASSWORD 오류");
        }


    }
}
