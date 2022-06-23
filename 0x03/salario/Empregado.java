public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        return calcularSalarioTotal(departamento) - salarioFixo;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return salarioFixo * 1.10;
        }
        return salarioFixo;
    }

}
