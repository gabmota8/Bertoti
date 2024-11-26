import java.util.ArrayList;
import java.util.List;

interface TaskObserver {
    void update(String message);
}

class TaskUser implements TaskObserver {
    private String name;
    public TaskUser(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " recebeu: " + message);
    }
}

class TaskSubject {
    private List<TaskObserver> observers = new ArrayList<>();
    public void addObserver(TaskObserver observer) { observers.add(observer); }
    public void notifyObservers(String message) {
        for (TaskObserver observer : observers) {
            observer.update(message);
        }
    }
}
