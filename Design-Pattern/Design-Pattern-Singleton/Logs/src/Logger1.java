public class Logger {

    private static Logger instance;
    private static final String LOG_FILE = "app.log";

    private Logger() {
        // Inicializa o logger, por exemplo, criando o arquivo de log
        try {
            // Código para criar o arquivo de log
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        // Lógica para registrar o log no arquivo
        try {
            // Código para escrever a mensagem no arquivo de log
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}