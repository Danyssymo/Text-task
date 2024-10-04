package my_task.one.bean;

import java.util.UUID;

public class CreateTaskResponse {

    private UUID taskId;

    public CreateTaskResponse(UUID taskId) {
        this.taskId = taskId;
    }

    public UUID getTaskId() {
        return taskId;
    }

}
