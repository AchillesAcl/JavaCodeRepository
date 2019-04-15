package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Reader;

public class JpgReader implements Reader {
    @Override
    public void read() {
        System.out.println("read:jpg");
    }
}
