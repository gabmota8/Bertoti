public class SingletonDemo {
    public static void main(String[] args) {
        // Obtendo a instância única do Logger
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        // Registrando mensagens de log
        logger1.log("Mensagem de log 1");
        logger2.log("Mensagem de log 2");

        // Verificando se ambas as referências apontam para a mesma instância
        if (logger1 == logger2) {
            System.out.println("logger1 e logger2 são a mesma instância.");
        } else {
            System.out.println("logger1 e logger2 são instâncias diferentes.");
        }
    }
}
