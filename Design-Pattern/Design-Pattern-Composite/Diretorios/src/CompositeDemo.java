// CompositeDemo.java
public class CompositeDemo {
    public static void main(String[] args) {
        ArquivoComponent arquivo1 = new Arquivo("Arquivo1.txt");
        ArquivoComponent arquivo2 = new Arquivo("Arquivo2.txt");

        Diretorio diretorio = new Diretorio("Diretório Raiz");
        diretorio.adicionar(arquivo1);
        diretorio.adicionar(arquivo2);

        ArquivoComponent subArquivo = new Arquivo("SubArquivo.txt");
        Diretorio subDiretorio = new Diretorio("SubDiretório");
        subDiretorio.adicionar(subArquivo);

        diretorio.adicionar(subDiretorio);

        diretorio.mostrar();
    }
}
