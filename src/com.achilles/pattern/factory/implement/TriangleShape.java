package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Shape;

public class TriangleShape implements Shape {
    public TriangleShape() {
        System.out.println(  "TriangleShape: created");
    }
    @Override
    public void draw() {
        System.out.println("TriangleShape:created");
    }
}
