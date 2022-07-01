package reference;

public class Bus {
    int busNum;
    int passenger;
    int money;
    public Bus(int busNum){
        this.busNum = busNum;
    }

    public void take(int money){
        this.money += money;
        passenger++;
    }

    public void showInfo(){
        System.out.println(busNum + "번 버스의 수입은 " +money+"원이고, " +
                "승객수는 "+passenger+"명 입니다.");
    }

}
