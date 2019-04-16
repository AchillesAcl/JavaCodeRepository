package com.achilles.pattern.command.others;

import com.achilles.pattern.command.contract.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 收集并命令人执行的人
 */
class Broker {
    private List<Command> commandList = new ArrayList<>();

    void receiveOrder(Command command) {
        commandList.add(command);
    }

    void executeOrders() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
