package mx.com.banxico.commons.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
