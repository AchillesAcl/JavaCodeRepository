package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Reader;

public class GifReader implements Reader {
    @Override
    public void read() {
        System.out.print("read gif");
    }
}
