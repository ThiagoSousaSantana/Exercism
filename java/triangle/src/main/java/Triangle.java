import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Triangle {

    private List<Double> sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.sides = Arrays.asList(side1, side2 ,side3);
        this.sides.sort(Double::compareTo);

        if ((sides.get(0) + sides.get(1)) < sides.get(2))  throw new TriangleException();
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
