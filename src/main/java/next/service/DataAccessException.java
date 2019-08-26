package next.service;

public class DataAccessException extends IllegalStateException {

    DataAccessException(String message) {
        super(message);
    }
}
