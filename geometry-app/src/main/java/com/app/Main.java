package com.app;
import com.geometry.core.*;
import com.geometry.utils.*;
import com.geometry.threed.*;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area: " + circle.area());
        System.out.println("Meters: " + GeometryUtils.cmToMeter(100));
        ThreeDShape cube = new Cube(3);
        System.out.println("Volume: " + cube.volume());
    }
}