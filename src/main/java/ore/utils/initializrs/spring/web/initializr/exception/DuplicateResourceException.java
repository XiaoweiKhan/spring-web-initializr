package ore.utils.initializrs.spring.web.initializr.exception;

public class DuplicateResourceException extends ResourceException {

    private static final String MESSAGE = "Duplicate resource found with ID: %s";

    public DuplicateResourceException(Object resourceId) {
        super(String.format(MESSAGE, resourceId));
    }
}
