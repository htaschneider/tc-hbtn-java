public class Quadrado extends Retangulo {

    private double lado;

    public void setLado(double lado) throws IllegalArgumentException {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.largura = lado;
        this.altura = lado;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }

}
