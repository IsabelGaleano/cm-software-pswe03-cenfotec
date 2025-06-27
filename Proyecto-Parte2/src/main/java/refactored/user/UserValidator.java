package refactored.user;

import refactored.interfaces.IValidator;

public class UserValidator implements IValidator<String> {
    @Override
    public boolean isValid(String name) {
        return name != null && !name.trim().isEmpty();
    }
}