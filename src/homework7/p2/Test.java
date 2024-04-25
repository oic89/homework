package homework7.p2;

public class Test {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Stick stick = new Stick();
        Tiger tiger = new Tiger();
        Worm worm = new Worm();
        System.out.println("A:" + stick.name() + "  B:" + tiger.name());
        if ("true".equals(stick.compete(tiger.name()))) {
            System.out.println("A胜");
        } else if ("false".equals(stick.compete(tiger.name()))) {
            System.out.println("B胜");
        } else {
            System.out.println("平手");
        }

        System.out.println("A:" + worm.name() + "  B:" + worm.name());
        if ("true".equals(worm.compete(worm.name()))) {
            System.out.println("A胜");
        } else if ("false".equals(worm.compete(worm.name()))) {
            System.out.println("B胜");
        } else {
            System.out.println("平手");
        }

        System.out.println("A:" + chicken.name() + "  B:" + tiger.name());
        if ("true".equals(chicken.compete(tiger.name()))) {
            System.out.println("A胜");
        } else if ("false".equals(chicken.compete(tiger.name()))) {
            System.out.println("B胜");
        } else {
            System.out.println("平手");
        }

        System.out.println("A:" + chicken.name() + "  B:" + worm.name());
        if ("true".equals(chicken.compete(worm.name()))) {
            System.out.println("A胜");
        } else if ("false".equals(chicken.compete(worm.name()))) {
            System.out.println("B胜");
        } else {
            System.out.println("平手");
        }

        System.out.println("A取得最终胜利");
    }

}
