import java.util.*;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            // [SMS] {LOG} - video2.avi - AVI
            String message = String.format("%s - %s\n", video.getArquivo(), video.getFormato());
            canal.notificar(new Mensagem(message, TipoMensagem.LOG));
        }
    }
}
