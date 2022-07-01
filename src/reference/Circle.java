package reference;

public class Circle {
        Point p;
        int radius;

        public Circle(int x,int y, int radius){
            p = new Point(x,y);
            this.radius = radius;
        }

        public String showInfo(){
            return "원의 중심은 ("+p.x+", "+p.y+") 반지름은 "+radius;
        }
}
