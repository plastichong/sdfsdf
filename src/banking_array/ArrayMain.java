package banking_array;

import java.util.Scanner;

public class ArrayMain {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택 > ");
            String selectNum = sc.next();
            if (selectNum.equals("1")) {
                createAccount();
            } else if (selectNum.equals("2")) {
                accountList();
            } else if (selectNum.equals("3")) {
                deposit();
            } else if (selectNum.equals("4")) {
                withDraw();
            } else if (selectNum.equals("5")) {
                run = false;
            } else {
                System.out.println("잘못입력하셨습니다");
            }
        }
        System.out.println("종료");
    }


    private static void createAccount() {
        System.out.println("---------------");
        System.out.println("계좌생성");
        System.out.println("---------------");

        while (true) {
            System.out.println("계좌번호 : ");
            String ano = sc.next();
            if (findAccount(ano) != null) {
                System.out.println("중복된 계좌입니다 다시 입력하세요");
            } else {
                System.out.println("계좌주 : ");
                String owner = sc.next();

                while (true) {

                    System.out.println("초기 입금액 : ");
                    int balance = sc.nextInt();
                    if (balance < 100) {
                        System.out.println(100+"원 이하");
                    } else {

                        Account newAccount = new Account(ano, owner, balance);
                        for (int i = 0; i < accountArray.length; i++) {
                            if (accountArray[i] == null) {
                                accountArray[i] = newAccount;
                                System.out.println("결과 : 계좌가 생성되었습니다");
                                break;
                            }
                        }
                        break;
                    }
                }
            }
                break;
        } //while
    }

    private static void accountList() {
        System.out.println("----------------------------------");
        System.out.println("계좌 목록");
        System.out.println("----------------------------------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (accountArray[i] != null) {
                String commaMoneyVal = String.valueOf(account.getBalance());
                commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                System.out.println("계좌번호: " + account.getAno());
                System.out.println("계좌주: " + account.getOwner());
                System.out.println("잔액: " + commaMoneyVal + "원");
            }
        }
    }

    private static void deposit() {
        System.out.println("----------------------------------");
        System.out.println("예금");
        System.out.println("----------------------------------");
        while (true) {
            System.out.println("계좌 번호: ");
            String ano = sc.next();
            findAccount(ano);
            if (findAccount(ano) == null) {
                System.out.println("일치하는 계좌가 없습니다");
                System.out.println("다시 입력하세요");
            } else {
                Account account = findAccount(ano);
                while (true) {
                    System.out.println("입금액 >");
                    int money = sc.nextInt();
                    if (money < 0) {
                        System.out.println("음수 입력 불가");
                    } else {
                        account.setBalance(account.getBalance() + money);
                        String commaMoneyVal = String.valueOf(money);
                        commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                        System.out.println("결과 :" + commaMoneyVal + "원 입금 성공");
                        break;
                    }
                }
                break;
            }
        }

    }

    private static void withDraw() {
        System.out.println("----------------------------------");
        System.out.println("출금");
        System.out.println("----------------------------------");
        while (true) {
            System.out.println("계좌 번호: ");
            String ano = sc.next();
            findAccount(ano);
            if (findAccount(ano) == null) {
                System.out.println("일치하는 계좌가 없습니다");
                System.out.println("다시 입력하세요");
            } else {
                Account account = findAccount(ano);
                while (true) {
                    System.out.println("출금액 >");
                    int money = sc.nextInt();
                    if (money < 0) {
                        System.out.println("음수 입력 불가");
                    } else if (money > account.getBalance()) {
                        System.out.println("잔액부족");
                    } else {
                        account.setBalance(account.getBalance() - money);
                        String commaMoneyVal = String.valueOf(money);
                        commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                        System.out.println("결과 :" + commaMoneyVal + "원 출금 성공");
                        break;
                    }
                }
                break;
            }
        }
    }

    private static Account findAccount(String ano) {
        Account account = null;
        if (accountArray[0] == null) {
            return null;
        }
        for (int i = 0; i < accountArray.length; i++) {
            String dbAno = accountArray[i].getAno();
            if (dbAno.equals(ano)) {
                account = accountArray[i];
                break;
            } else {
                return null;
            }
        }
        return account;
    }
}
