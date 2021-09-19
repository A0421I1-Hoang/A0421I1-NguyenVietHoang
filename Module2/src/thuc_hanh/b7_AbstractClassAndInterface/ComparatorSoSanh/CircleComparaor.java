package b7_AbstractClassAndInterface.ComparatorSoSanh;

import javafx.scene.shape.Circle;

import java.util.Comparator;

public class CircleComparaor implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
