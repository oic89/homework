package homework7.p2;

public class Tiger implements Name {
    @Override
    public String name() {
        return "老虎";
    }

    @Override
    public String compete(String n) {
        if ("鸡".equals(n)) {
            return "true";
        } else if ("棒子".equals(n)) {
            return "false";
        } else {
            return "null";
        }
    }
}
