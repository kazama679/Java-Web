package ra.com.model;

public class B8 {
    private int id;
    private String description;
    private String dueDate;
    private boolean completed;

    public B8() {}

    public B8(int id, String description, String dueDate, boolean completed) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id: " + id +
                ", description:'" + description + '\'' +
                ", dueDate: '" + dueDate + '\'' +
                ", completed: " + completed +
                '}';
    }
}