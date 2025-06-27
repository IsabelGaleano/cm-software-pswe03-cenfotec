package refactored.user;

import refactored.constants.UserErrors;
import refactored.constants.UserMessages;
import refactored.interfaces.ILogger;
import refactored.interfaces.IValidator;

public class UserHandler {
    private final ILogger logger;
    private final IValidator<String> validator;

    public UserHandler(ILogger logger, IValidator<String> validator) {
        this.logger = logger;
        this.validator = validator;
    }

    private boolean validateAndLog(String name) {
        if (!validator.isValid(name)) {
            logger.log(UserErrors.EMPTY_USER);
            return false;
        }
        return true;
    }

    public void process(String name) {
        if (!validateAndLog(name)) return;
        logger.log(UserMessages.WELCOME + name);
    }

    public void notifyUser(String name) {
        if (!validateAndLog(name)) return;
        logger.log(UserMessages.EMAIL + name);
    }

    public void printUser(String name) {
        if (!validateAndLog(name)) return;
        logger.log(UserMessages.PRINT + name);
    }
}
