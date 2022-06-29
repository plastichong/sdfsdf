package operation;

public class TypeConversion {
    public static void main(String[] args) {

        byte bV1 = 10;
        byte bV2 = 20;
//        byte bV3 = bV1+bV2; //컴파일 에러
        byte bV3 = (byte) (bV1 + bV2); //계산결과에 형변환 필요
        int iV = bV1 + bV2;

        char cV1 = 'A';
        char cV2 = 1;
//        char cV3 = cV1+cV2; //컴파일 에러
        iV = cV1+cV2;
        System.out.println((int)(cV1)+cV2);
        int iV2 = 10;
        int iV3 = iV2/4;
        System.out.println(iV3);
    }
}
