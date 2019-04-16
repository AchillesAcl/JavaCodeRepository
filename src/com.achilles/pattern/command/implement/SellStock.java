package com.achilles.pattern.command.implement;

import com.achilles.pattern.command.contract.Command;
import com.achilles.pattern.command.others.Stock;

public class SellStock implements Command {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
