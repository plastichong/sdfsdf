package information_hiding;

public class Account {
    private String ano;         //계좌번호
    private String owner;       //계좌주인
    private int balance;        //잔액

        void setAno(String ano){
            this.ano = ano;
        }
        String getAno(){
            return this.ano;
        }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public Account() {
    }
    public Account(String ano, String owner, int balance){
            this.ano = ano;
            this.owner = owner;
            this.balance = balance;
    }
}
