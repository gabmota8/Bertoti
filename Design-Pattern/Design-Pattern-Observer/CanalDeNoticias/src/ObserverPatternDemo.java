

public class ObserverPatternDemo {
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();

        Observador assinante1 = new Assinante("Julio Power BI");
        Observador assinante2 = new Assinante("Pablo Marçal");

        canal.registrarObservador(assinante1);
        canal.registrarObservador(assinante2);

        canal.novaNoticia("Nova notícia sobre POwer APPS!");
        canal.novaNoticia("Mais uma notícia importante!");

        canal.removerObservador(assinante1);

        canal.novaNoticia("Notícia exclusiva para Pablo Marçal: Você e um merda!!!!.");
    }
}
