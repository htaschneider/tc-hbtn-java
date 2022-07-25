import java.io.*;
import java.util.List;

public class SerializarEstudantes<T> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> list) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
            outputStream.writeObject(list);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> desserializar() {
        List<T> list = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo));
            list = (List<T>) inputStream.readObject();
            inputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return list;
    }
}