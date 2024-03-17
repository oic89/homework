package homework3;

public class Test {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 1);
        Complex complex2 = new Complex(2, -2);
        System.out.println("complex1 = " + complex1);
        System.out.println("complex2 = " + complex2);

        complex1.add(complex2);
        System.out.println("complex1 = complex1 + complex2 = " + complex1);

        complex1.reduce(complex2);
        System.out.println("complex1 = complex1 - complex2 = " + complex1);

        complex1.multiplication(complex2);
        System.out.println("complex1 = complex1 * complex2 = " + complex1);

    }
}
