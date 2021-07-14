public class DuplicateProductException extends RuntimeException {
    private int id;

    public DuplicateProductException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Продукт с id = " + id + " уже существует";
    }
}
