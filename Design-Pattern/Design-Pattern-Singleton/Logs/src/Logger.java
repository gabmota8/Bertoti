public class Logger {
    // Instância única da classe Logger
    private static Logger instanciaUnica;

    // Construtor privado para evitar instanciamento externo
    private Logger() {
    }

    // Método para obter a instância única da classe
    public static Logger getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Logger();
        }
        return instanciaUnica;
    }

    // Método para registrar uma mensagem de log
    public void log(String mensagem) {
        System.out.println("Log: " + mensagem);
    }
}
