package com.achilles.pattern.factory.contract;



public interface SystemFactory {
    public OperationController createOperationController();
    public UIController createInterfaceController();
}
