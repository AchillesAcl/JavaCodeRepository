package com.achilles.pattern.factory.implement;

import com.achilles.pattern.factory.contract.Shape;

public class CircleShape implements Shape {
    public CircleShape() {
        System.out.println("CircleShape:created");
    }

    @Override
    public void draw() {
        System.out.println("draw:CircleShape");
    }
}
