public class Numero {
    public static void dividir(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (Exception ex) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a + " / " + b + " = " + res);
        }
    }
}
