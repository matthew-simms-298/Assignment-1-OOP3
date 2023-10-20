package application.Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    public abstract double getHeight();
    public abstract double getBaseArea();
    public abstract double getVolume();

    @Override
    public int compareTo(Shape s) {
        return Double.compare(this.getHeight(), s.getHeight());
    }

    @Override
    public int compare(Shape s1, Shape s2) {
        int baseAreaComparison = Double.compare(s1.getBaseArea(), s2.getBaseArea());
        if (baseAreaComparison != 0) {
            return baseAreaComparison;
        } else {
            return Double.compare(s1.getVolume(), s2.getVolume());
        }
    }
}
