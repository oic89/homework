package homework7.p2;

public class Chicken implements Name {
    @Override
    public String name() {
        return "鸡";
    }

    @Override
    public String compete(String n) {
        if ("虫子".equals(n)) {
            return "true";
        } else if ("老虎".equals(n)) {
            return "false";
        } else {
            return "null";
        }
    }
}
