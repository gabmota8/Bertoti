// Diretorio.java
import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ArquivoComponent {
    private String nome;
    private List<ArquivoComponent> arquivos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionar(ArquivoComponent arquivo) {
        arquivos.add(arquivo);
    }

    public void remover(ArquivoComponent arquivo) {
        arquivos.remove(arquivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Diretório: " + nome);
        for (ArquivoComponent arquivo : arquivos) {
            arquivo.mostrar();
        }
    }
}
