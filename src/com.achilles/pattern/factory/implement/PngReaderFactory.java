package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Reader;
import com.achilles.pattern.factory.contract.ReaderFactory;

public class PngReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}