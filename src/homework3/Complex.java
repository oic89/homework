package homework3;

public class Complex {
    private double real;
    private double imag;

    public Complex() {
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    //加
    public Complex add(Complex otherComplex) {
        this.real += otherComplex.real;
        this.imag += otherComplex.imag;
        return this;
    }

    //减
    public Complex reduce(Complex otherComplex) {
        this.real -= otherComplex.real;
        this.imag -= otherComplex.imag;
        return this;
    }

    //乘
    public Complex multiplication(Complex otherComplex) {
        this.real = this.real * otherComplex.real - this.imag * otherComplex.imag;
        this.imag = this.imag * otherComplex.real + this.real * otherComplex.imag;
        return this;
    }

    @Override
    public String toString() {
        String sign = "+";
        if (this.imag < 0) {
            sign = "";
        }
        return this.real + sign + this.imag + "i";
    }
}
