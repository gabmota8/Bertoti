public class ConfigManager {

    // Instância única do Singleton
    private static ConfigManager instance;

    // Variáveis de configuração (simulação)
    private String appName;
    private String version;

    // Construtor privado para evitar instâncias externas
    private ConfigManager() {
        // Configurações padrão
        this.appName = "MeuApp";
        this.version = "1.0.0";
    }

    // Método público e estático para obter a única instância
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Métodos de acesso às configurações
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
