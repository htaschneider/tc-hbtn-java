import java.util.Locale;
import java.text.NumberFormat;

public class PrintFormatacaoNumeros {
  public static void main(String[] args) {
    float taxa = 0.2456f;
    float valor = 7654.321f;
    System.out.println("Valor: " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor));
    System.out.printf("Taxa: %.2f%%\n", taxa);
  }
}
