public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) throws IllegalArgumentException {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.largura * this.altura;
    }

    @Override
    public String toString() {
        return "[Retangulo] " + this.largura + " / " + this.altura;
    }
}
