package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.UIController;

public class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}
