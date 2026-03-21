package com.geometry.utils;
import com.geometry.core.Shape;
public class GeometryUtils {
    public static double cmToMeter(double cm) { return cm / 100; }
    public static int compareArea(Shape s1, Shape s2) {
        return Double.compare(s1.area(), s2.area());
    }
}