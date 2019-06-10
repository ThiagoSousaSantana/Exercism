import java.util.Arrays;
import java.util.List;

class Triangle {

    private List<Double> sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.sides = Arrays.asList(side1, side2 ,side3);
        this.sides.sort(Double::compareTo);

        if ((sides.get(0) + sides.get(1)) < sides.get(2))  throw new TriangleException();
        if (sides.get(0) <= 0) throw new TriangleException();
    }

    boolean isEquilateral() {
        return sides.get(0).equals(sides.get(2));
    }

    boolean isIsosceles() {
        return sides.get(0).equals(sides.get(1)) || sides.get(1).equals(sides.get(2));
    }

    boolean isScalene() {
        return !isIsosceles();
    }

}