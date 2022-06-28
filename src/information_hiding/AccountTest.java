package information_hiding;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAno("12345");
        ac.setOwner("홍길동");
        ac.setBalance(1500);

        Account ac2 = new Account("9999","고길동",138956);


        System.out.println("계좌번호 : "+ac.getAno());
        System.out.println("계좌주 : "+ac.getOwner());
        System.out.println("잔액 : "+ac.getBalance());

        System.out.println("=======================");

        System.out.println("계좌번호 : "+ac2.getAno());
        System.out.println("계좌주 : "+ac2.getOwner());
        System.out.println("잔액 : "+ac2.getBalance());

        String str1 = new String("wee");
//              String str1 = "wee";
        String str2 = new String("wee");
//              String str2 = "wee";


        System.out.println((str1 == str2));

        System.out.println((ac.getAno() == ac2.getAno()));
    }
}

