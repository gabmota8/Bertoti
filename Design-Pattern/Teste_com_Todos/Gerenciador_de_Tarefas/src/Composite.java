import java.util.ArrayList;
import java.util.List;

interface Task {
    void showDetails();
}

class SimpleTask implements Task {
    private String name;
    public SimpleTask(String name) { this.name = name; }
    public void showDetails() { System.out.println(name); }
}

class CompositeTask implements Task {
    private String name;
    private List<Task> subTasks = new ArrayList<>();
    public CompositeTask(String name) { this.name = name; }
    public void add(Task task) { subTasks.add(task); }
    public void showDetails() {
        System.out.println(name);
        for (Task task : subTasks) {
            task.showDetails();
        }
    }
}
