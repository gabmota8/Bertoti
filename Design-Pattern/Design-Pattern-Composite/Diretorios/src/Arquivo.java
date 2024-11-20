// Arquivo.java
public class Arquivo implements ArquivoComponent {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.println("Arquivo: " + nome);
    }
}
