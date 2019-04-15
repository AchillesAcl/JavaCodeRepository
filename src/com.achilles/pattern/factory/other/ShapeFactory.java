package com.achilles.pattern.factory.other;

import com.achilles.pattern.factory.contract.Shape;
import com.achilles.pattern.factory.implement.CircleShape;
import com.achilles.pattern.factory.implement.RectShape;
import com.achilles.pattern.factory.implement.TriangleShape;

public class ShapeFactory {
    public static final String TAG = "ShapeFactory";
    public static Shape getShape(String type) {
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")) {
            shape = new CircleShape();
        } else if (type.equalsIgnoreCase("rect")) {
            shape = new RectShape();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new TriangleShape();
        }
        return shape;
    }
}