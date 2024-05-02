package homework8.p2;

public class Triangle {
    private double[] sides;

    public Triangle(double[] sides) throws IllegalArgumentException {
        if (!isValidTriangle(sides)) {
            throw new IllegalArgumentException("不能构成三角形");
        }
        this.sides = sides;
    }

    private boolean isValidTriangle(double[] sides) {
        return (sides[0] + sides[1] > sides[2]) && (sides[1] + sides[2] > sides[0]) && (sides[0] + sides[2] > sides[1]);
    }

    public double getC() {
        return Math.round((sides[0] + sides[1] + sides[2])*100)/100.0;
    }

    public double getS() {
        // 海伦公式计算面积
        double p = getC() / 2;
        double area= Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        return Math.round(area*100)/100.0;
    }

    public TriangleType getType() {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        // 计算余弦值
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (a * a + b * b - c * c) / (2 * a * b);

        // 判断三角形的类型
        if (cosA > 0 && cosB > 0 && cosC > 0) {
            return TriangleType.锐角三角形;
        } else if (cosA == 0 || cosB == 0 || cosC == 0) {
            return TriangleType.直角三角形;
        } else if (cosA < 0 || cosB < 0 || cosC < 0) {
            return TriangleType.钝角三角形;
        }
        return null;
    }
}
