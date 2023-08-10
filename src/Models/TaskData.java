package Models;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    public Set<Task> annsTasks=new HashSet<>();
    public Set<Task> bobsTasks=new HashSet<>();
    public Set<Task> carolsTasks=new HashSet<>();
    public Set<Task> allTasks=new HashSet<>();

    public Set<Task> getTasks(String task){
        return switch (task) {
            case "ann" -> annsTasks;
            case "bobs" -> bobsTasks;
            case "carols" -> carolsTasks;
            default -> allTasks;
        };
    }

    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                ", allTasks=" + allTasks +
                '}';
    }
}
