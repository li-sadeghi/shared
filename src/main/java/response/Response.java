package response;

import java.util.HashMap;

public class Response {
    private ResponseStatus status;
    private HashMap<String, Object> data;
    private String errorMessage;
    // Another field for messages from server to client

    public Response() {
        data = new HashMap<>();
    }

    public Response(ResponseStatus status) {
        this.status = status;
        data = new HashMap<>();
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void addData(String dataName, Object data) {
        this.data.put(dataName, data);
    }

    public Object getData(String dataName) {
        return this.data.get(dataName);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setHashMap() {
        data = new HashMap<>();
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
