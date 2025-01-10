package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements ITask {
    private String title;
    private List<ITask> taskList;

    public TaskList(String title) {
        this.title = title;
        this.taskList = new ArrayList<>();
    }

    @Override
    public void finish() {
        if (!taskList.isEmpty()) {
            taskList.getFirst().finish();
        }
    }

    @Override
    public boolean isFinished() {
        if (!taskList.isEmpty()) {
            return taskList.getFirst().isFinished();
        }
        return false;
    }

    @Override
    public String getDescription() {
        String description = "TaskList{";
        if (!taskList.isEmpty()) {
            description += taskList.getFirst().getDescription();
        }
        for (int i = 1; i < taskList.size(); i++) {
            description += ", " + taskList.get(i).getDescription();
        }
        description += "}";
        return description;
    }

    public void append(ITask task) {
        taskList.add(task);
    }
}
