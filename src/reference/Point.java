package reference;

public class Point {
    //point class
    //field // member var
    int x,y;

    //constructor
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void showInfo(){
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
