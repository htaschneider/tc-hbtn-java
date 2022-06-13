public class InteiroPositivo {

  private int valor;

  public InteiroPositivo(int valor) {
    if (valor < 0) {
      throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
    }
    this.valor = valor;
  }

  public InteiroPositivo(String valor) {
    try {
      int val = Integer.parseInt(valor);
      if (val < 0) {
        throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
      }
      this.valor = val;

    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
    }
  }

  public int getValor() {
    return this.valor;
  }

  public void setValor(int novo_valor) {
    if (novo_valor < 0) {
      throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
    }
    this.valor = novo_valor;
  }

  public boolean ehPrimo() {
    if (valor <= 1) {
      return false;
    }
    for (int i = 2; i < valor; i++) {
      if (valor % i == 0) {
        return false;
      }
    }
    return true;
  }

}
