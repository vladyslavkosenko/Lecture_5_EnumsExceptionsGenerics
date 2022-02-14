public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }
    public WrongLoginException(String massage) {
        super(massage);
    }
}
