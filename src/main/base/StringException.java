package main.base;

public class StringException extends Exception {
    private StringErrorCode errorCode;

    public StringErrorCode getErrorCode(){
        return errorCode;
    }
    public StringException(StringErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
