package collection.stack;

import java.util.Stack;

public class StackCoinTest {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();
        //    Stack -> Vector상속

        Coin coin500 = new Coin(500);
        Coin coin100 = new Coin(100);
        Coin coin50 = new Coin(50);
        Coin coin10 = new Coin(10);

        coinStack.push(coin500);
        coinStack.push(coin100);
        coinStack.push(coin50);
        coinStack.push(coin10);

        System.out.println(coinStack.get(0).getValue());


        while (!coinStack.isEmpty()) {
            Coin coin = coinStack.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue());
        }

    }
}
