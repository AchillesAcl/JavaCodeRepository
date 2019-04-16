package com.achilles.pattern.command.implement;

import com.achilles.pattern.command.contract.Command;
import com.achilles.pattern.command.others.Stock;

/**
 * 不同的命令
 */
public class BuyStock implements Command {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
