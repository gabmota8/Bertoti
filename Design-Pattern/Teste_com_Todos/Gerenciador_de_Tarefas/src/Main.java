public class Main {
    public static void main(String[] args) {
        // Composite Pattern
        CompositeTask project = new CompositeTask("Projeto");
        project.add(new SimpleTask("Tarefa 1"));
        CompositeTask subProject = new CompositeTask("Subprojeto");
        subProject.add(new SimpleTask("Tarefa 2"));
        subProject.add(new SimpleTask("Tarefa 3"));
        project.add(subProject);
        project.showDetails();
        
        // Singleton Pattern
        TaskManager manager1 = TaskManager.getInstance();
        TaskManager manager2 = TaskManager.getInstance();
        System.out.println(manager1 == manager2); // true
        
        // Observer Pattern
        TaskSubject subject = new TaskSubject();
        TaskObserver user1 = new TaskUser("Usuário 1");
        TaskObserver user2 = new TaskUser("Usuário 2");
        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.notifyObservers("Nova tarefa adicionada ao projeto!");
        
        // Strategy Pattern
        TaskContext context = new TaskContext();
        context.setStrategy(new HighPriorityStrategy());
        context.executeStrategy(); // Executando tarefas de alta prioridade.
        context.setStrategy(new LowPriorityStrategy());
        context.executeStrategy(); // Executando tarefas de baixa prioridade.
    }
}
