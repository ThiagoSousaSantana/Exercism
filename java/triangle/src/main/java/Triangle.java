import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Triangle {

    private List<Double> sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if ((side1 + side2) < side3)  throw new TriangleException();
        if ((side1 + side3) < side2)  throw new TriangleException();
        if ((side2 + side3) < side1)  throw new TriangleException();

        this.sides = Arrays.asList(side1, side2 ,side3);

        // If some side is <= 0
        for (double s : this.sides) if (s <= 0) throw new TriangleException();
    }

    boolean isEquilateral() {
        return new HashSet<>(sides).size() == 1;
    }

    boolean isIsosceles() {
        return new HashSet<>(sides).size() <= 2;
    }

    boolean isScalene() {
        return new HashSet<>(sides).size() == 3;
    }

}
