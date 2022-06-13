public class PersonagemGame {

  private int saudeAtual;
  private String nome;

  public int getSaudeAtual() {
    return saudeAtual;
  }

  public void setSaudeAtual(int saudeAtual) {
    this.saudeAtual = saudeAtual;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void tomarDano(int quantidadeDeDano) {
    this.saudeAtual = Math.max(0, saudeAtual - quantidadeDeDano);
  }

  public void receberCura(int quantidadeDeCura) {
    this.saudeAtual = Math.min(100, saudeAtual + quantidadeDeCura);
  }

}
