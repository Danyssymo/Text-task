package my_task.one.bean;

public class ErrorResponse {

    private String errorMessage;
    private int errorCode;

    public ErrorResponse(String errorMessage, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

}
