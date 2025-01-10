package structural.composite;

public class Task implements ITask {
    private boolean isFinished = false;
    private String title;

    public Task(String title) {
        this.title = title;
    }

    @Override
    public void finish() {
        isFinished = true;
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public String getDescription() {
        return "Task{" +
                "title='" + title + "'" +
                ", isFinished='" + isFinished + "'" +
                "}";
    }
}
