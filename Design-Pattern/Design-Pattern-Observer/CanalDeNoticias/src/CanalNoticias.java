
import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Sujeito {
    private List<Observador> observadores;
    private String ultimaNoticia;

    public CanalNoticias() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        this.observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(ultimaNoticia);
        }
    }

    public void novaNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        notificarObservadores();
    }
}
