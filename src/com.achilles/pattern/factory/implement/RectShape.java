package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Shape;

public class RectShape implements Shape {
    public RectShape() {
        System.out.println(  "RectShape: created");
    }

    @Override
    public void draw() {
        System.out.println(  "draw: RectShape");
    }
}
