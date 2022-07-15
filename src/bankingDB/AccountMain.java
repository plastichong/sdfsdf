package bankingDB;

import banking_arraylist.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMain {
    private static ArrayList<banking_arraylist.Account> accountArrayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    AccountDao dao = new AccountDao();


        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌검색 | 6.계좌삭제 | 7.종료 ");
            System.out.println("----------------------------------------------");
            System.out.print("선택 > ");
            String selectNum = sc.next();
            if (selectNum.equals("1")) {
                dao.createAccount();
            } else if (selectNum.equals("2")) {
                dao.getAccountList();
            } else if (selectNum.equals("3")) {
                dao.deposit();
            } else if (selectNum.equals("4")) {
                dao.withDraw();
            } else if (selectNum.equals("5")) {
                dao.viewAccount();
            } else if (selectNum.equals("6")) {
                dao.removeAccount();
            } else if (selectNum.equals("7")) {
                System.out.println("종료");
                run = false;
            } else {
                System.out.println("잘못입력하셨습니다");
            }
        }
    }


}
