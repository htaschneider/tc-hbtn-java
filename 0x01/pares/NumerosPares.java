
public class NumerosPares {

    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            if (i == 0) {
                System.out.print(i);
            } else {
                if (i % 2 == 0) {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
    }

}

