import Enums.Priority;
import Enums.Status;
import Models.Task;
import Models.TaskData;

public class Main {
    public static void main(String[] args) {
        System.out.println(createTasks().annsTasks);
        System.out.println(createTasks().bobsTasks);
        System.out.println(createTasks().carolsTasks);
        System.out.println(createTasks().allTasks);
    }

    public static TaskData createTasks(){
        Task task1=new Task("project1","description1","carols", Priority.HIGH, Status.ASSIGNED_IN);
        Task task2=new Task("project2","description2","carols", Priority.LOW, Status.IN_PROGRESS);
        Task task3=new Task("project3","description3","bobs", Priority.HIGH, Status.IN_PROGRESS);
        Task task4=new Task("project4","description4","carols", Priority.LOW, Status.IN_PROGRESS);
        Task task5=new Task("project5","description5","anns", Priority.MEDIUM, Status.ASSIGNED_IN);
        Task task6=new Task("project2","description6","bobs", Priority.MEDIUM, Status.IN_PROGRESS);
        Task task7=new Task("project6","description3","anns", Priority.LOW, Status.ASSIGNED_IN);
        Task task8=new Task("project8","description8","", Priority.HIGH, Status.IN_QUEUE);
        Task task9=new Task("project8","description8","", Priority.HIGH, Status.IN_QUEUE);


        TaskData taskdata=new TaskData();
        taskdata.allTasks.add(task1);
        taskdata.allTasks.add(task2);
        taskdata.allTasks.add(task3);
        taskdata.allTasks.add(task4);
        taskdata.allTasks.add(task5);
        taskdata.allTasks.add(task6);
        taskdata.allTasks.add(task7);
        taskdata.allTasks.add(task8);
        taskdata.allTasks.add(task9);

        taskdata.allTasks.forEach(item-> {
            switch (item.getAssignee()) {
                case "bobs" -> taskdata.bobsTasks.add(item);
                case "anns" -> taskdata.annsTasks.add(item);
                case "carols" -> taskdata.carolsTasks.add(item);
            }
        });
        return taskdata;
    }
}