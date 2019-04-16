package com.achilles.pattern.command.others;

import com.achilles.pattern.command.implement.BuyStock;
import com.achilles.pattern.command.implement.SellStock;

/**
 * @author Administrator
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.receiveOrder(buyStock);
        broker.receiveOrder(sellStock);
        broker.executeOrders();
    }
}
