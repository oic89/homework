package homework7.p2;

public class Worm implements Name {
    @Override
    public String name() {
        return "虫子";
    }

    @Override
    public String compete(String n) {
        if ("棒子".equals(n)) {
            return "true";
        } else if ("鸡".equals(n)) {
            return "false";
        } else {
            return "null";
        }
    }
}
