package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.OperationController;

public class AndroidOperationController implements OperationController {

    @Override
    public void control() {
        System.out.println("AndroidOperationController");
    }
}
