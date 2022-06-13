public class PersonagemGame {

  private int saudeAtual;
  private String nome;
  private String status;

  public PersonagemGame(int saudeAtual, String nome) {
    setSaudeAtual(saudeAtual);
    this.nome = nome;
  }

  public int getSaudeAtual() {
    return saudeAtual;
  }

  public void setSaudeAtual(int saudeAtual) {
    this.saudeAtual = saudeAtual;
    if (saudeAtual == 0) {
      status = "morto";
    } else {
      status = "vivo";
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome != null && !nome.equals("")) {
      this.nome = nome;
    }
  }

  public void tomarDano(int quantidadeDeDano) {
    this.saudeAtual = Math.max(0, saudeAtual - quantidadeDeDano);
    if (saudeAtual == 0) {
      status = "morto";
    }
  }

  public void receberCura(int quantidadeDeCura) {
    this.saudeAtual = Math.min(100, saudeAtual + quantidadeDeCura);
    if (saudeAtual > 0 && !status.equals("vivo")) {
      status = "vivo";
    }
  }
  
  public String getStatus() {
    return status;
  }

}
