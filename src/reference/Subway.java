package reference;

public class Subway {
    String linNumber;
    int passenger;
    int money;

    public Subway(String linNumber) {
        this.linNumber = linNumber;
    }


//    public void Subway(String linNumber){
//    }

    public void take(int money){

        this.money += money;
        passenger ++;
    }
    public void showInfo(){
        System.out.println(linNumber + "지하철의 수입은 " +money+"원이고, " +
                "승객수는 "+passenger+"명 입니다.");
    }

}
