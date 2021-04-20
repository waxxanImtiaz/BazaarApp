package bazaar.api;

/*
* resCode = -1( data not found)
* resCode = 0( Success)
*
* */
public class BaseResponse<T> {
    private String message;
    private String resCode;
    private T responseObject;

    public T getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(T responseObject) {
        this.responseObject = responseObject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

}
