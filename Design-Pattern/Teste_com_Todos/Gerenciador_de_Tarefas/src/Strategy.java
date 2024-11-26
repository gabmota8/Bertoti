interface TaskStrategy {
    void execute();
}

class HighPriorityStrategy implements TaskStrategy {
    public void execute() { System.out.println("Executando tarefas de alta prioridade."); }
}

class LowPriorityStrategy implements TaskStrategy {
    public void execute() { System.out.println("Executando tarefas de baixa prioridade."); }
}

class TaskContext {
    private TaskStrategy strategy;
    public void setStrategy(TaskStrategy strategy) { this.strategy = strategy; }
    public void executeStrategy() { strategy.execute(); }
}
