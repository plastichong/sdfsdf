package array;

public class Product {

        String name;
        int price;

        Product(){
        }
        Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String showInfo(){
            return name + "," + price;
        }
}
