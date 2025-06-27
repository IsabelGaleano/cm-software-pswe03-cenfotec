package refactored.interfaces;

public interface IValidator<T> {
    boolean isValid(T value);
}