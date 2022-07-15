package bankingDB;

import bankingDB.common.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountDao {

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {

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
                        System.out.println(100 + "원 이하");
                    } else {
                        try {

                            conn = JDBCUtil.getConnection();
                            String sql = "INSERT INTO ACCOUNT(ANO,OWNER,BALANCE) VALUES(?,?,?)";
                            pstmt = conn.prepareStatement(sql);
                            pstmt.setString(1, ano);
                            pstmt.setString(2, owner);
                            pstmt.setInt(3, balance);
                            pstmt.executeUpdate();
                            System.out.println("결과 : 계좌가 생성되었습니다");
                            break;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } finally {
                            JDBCUtil.close(conn, pstmt);
                        }
                    }
                }
                break;
            }
        } //while


    }



    public void removeAccount() {
        System.out.println("----------------------------------");
        System.out.println("계좌 삭제");
        System.out.println("----------------------------------");
        while (true) {
            System.out.print("계좌 번호: ");
            String ano = sc.next();
            if (findAccount(ano) != null) {
                try {
                Account account = findAccount(ano);
                conn = JDBCUtil.getConnection();
                String sql = "DELETE FROM ACCOUNT WHERE ANO =?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,ano);
                pstmt.executeUpdate();
                System.out.println("삭제 완료");
                break;
                }catch (SQLException e){
                    e.printStackTrace();
                }finally {
                    JDBCUtil.close(conn,pstmt);
                }
            } else{
                System.out.println("일치하는 계좌가 없습니다 다시 입력하세요");
            }
        }
    }

    public List<Account> getAccountList() {
        List<Account> accountList = new ArrayList<>();

        System.out.println("----------------------------------");
        System.out.println("계좌 목록");
        System.out.println("----------------------------------");

        try {
            conn = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ACCOUNT";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String ano = rs.getString("ano");
                String owner = rs.getString("owner");
                int balance = rs.getInt("balance");

                Account account = new Account(ano, owner, balance);
                accountList.add(account);
            }

            for (int i = 0; i < accountList.size(); i++) {
                Account account = accountList.get(i);
                String commaMoneyVal = String.valueOf(account.getBalance());
                commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                System.out.println("----------------------------------");
                System.out.println("계좌번호: " + account.getAno());
                System.out.println("계좌주: " + account.getOwner());
                System.out.println("잔액: " + commaMoneyVal + "원\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,pstmt,rs);
        }
        return accountList;
    }

    public void viewAccount() {
        System.out.println("----------------------------------");
        System.out.println("계좌 검색");
        System.out.println("----------------------------------");
        while (true) {
            System.out.print("계좌 번호: ");
            String ano = sc.next();
            if (findAccount(ano) != null) {
                Account account = findAccount(ano);
                String commaMoneyVal = String.valueOf(account.getBalance());
                commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                System.out.println("----------------------------------");
                System.out.println("계좌번호: " + account.getAno());
                System.out.println("계좌주: " + account.getOwner());
                System.out.println("잔액: " + commaMoneyVal + "원\n");
                break;
            } else
                System.out.println("일치하는 계좌가 없습니다 다시 입력하세요");
        }
    }

    public void deposit() {
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
                    String owner = account.getOwner();
                    int balance = account.getBalance()+money;
                    if (money < 0) {
                        System.out.println("음수 입력 불가");
                    } else {
                        try {
                            conn = JDBCUtil.getConnection();
                            String sql = "UPDATE ACCOUNT SET OWNER = ?, BALANCE = ? WHERE ANO = ?";
                            pstmt = conn.prepareStatement(sql);
                            pstmt.setString(1,owner);
                            pstmt.setInt(2,balance);
                            pstmt.setString(3,ano);
                            pstmt.executeUpdate();

                            String commaMoneyVal = String.valueOf(money);
                            commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                            System.out.println("결과 :" + commaMoneyVal + "원 입금 성공");
                            break;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }finally {
                            JDBCUtil.close(conn,pstmt);
                        }
                    }
                }
                break;
            }
        }
    }


    public void withDraw(){
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
                    String owner = account.getOwner();
                    int balance = account.getBalance()-money;
                    if (money < 0) {
                        System.out.println("음수 입력 불가");
                    } else if (money > account.getBalance()) {
                        System.out.println("잔액부족");
                    } else {
                        try {

                        conn = JDBCUtil.getConnection();
                        String sql = "UPDATE ACCOUNT SET OWNER = ?, BALANCE = ? WHERE ANO = ?";
                        pstmt = conn.prepareStatement(sql);
                        pstmt.setString(1,owner);
                        pstmt.setInt(2,balance);
                        pstmt.setString(3,ano);
                        pstmt.executeUpdate();

                        String commaMoneyVal = String.valueOf(money);
                        commaMoneyVal = commaMoneyVal.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
                        System.out.println("결과 :" + commaMoneyVal + "원 출금 성공");
                        break;
                        }catch (SQLException e){
                            e.printStackTrace();
                        }finally {
                            JDBCUtil.close(conn,pstmt);
                        }
                    }
                }
                break;
            }
        }

    }


    public Account findAccount(String ano) {
        Account account = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ACCOUNT WHERE ANO = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ano);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                ano = rs.getString("ano");
                String owner = rs.getString("owner");
                int balance = rs.getInt("balance");
                account = new Account(ano, owner, balance);
                return account;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,pstmt);
        }
        return account;
    }

}



