package homework7.p2;

public class Stick implements Name{
    @Override
    public String name() {
        return "棒子";
    }

    @Override
    public String compete(String n) {
        if ("老虎".equals(n)){
            return "true";
        }else if ("虫子".equals(n)){
            return "false";
        }else{
            return "null";
        }
    }
}
