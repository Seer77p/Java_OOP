public class Complex implements ComplexNumber{
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber number) {
        double real = this.realPart + number.getRealPart();
        double imaginary = this.imaginaryPart + number.getImaginaryPart();
        return new Complex(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number) {
        double real = (this.realPart * number.getRealPart() - (this.imaginaryPart * number.getImaginaryPart()));
        double imaginary = (this.realPart * number.getImaginaryPart()) + (this.imaginaryPart * number.getRealPart());
        return new Complex(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number) {
        double denominator = Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginaryPart(), 2);
        double real = ((this.realPart * number.getRealPart())+(this.imaginaryPart * number.getImaginaryPart()))/denominator;
        double imaginary = ((this.imaginaryPart * number.getRealPart()) - (this.realPart * number.getImaginaryPart()))/denominator;
        return new Complex(real, imaginary);
    }

    @Override
    public String toString() {
        return "Комплексное число: " +
                "действительная часть = " + realPart +
                ", мнимая часть = " + imaginaryPart;
    }
}
