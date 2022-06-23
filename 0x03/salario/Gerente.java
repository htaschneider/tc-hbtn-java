public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularSalarioTotal(Departamento departamento) {
        double salario = super.getSalarioFixo();
        if (departamento.alcancouMeta()) {
            return (salario * 1.20) + 0.01 * (departamento.getValorAtingidoMeta() - departamento.getValorMeta());
        }
        return salario;
    }

}
