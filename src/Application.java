import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Привет.");
        run();
        System.out.println("Пока.");
    }

    private void run() {
        while (true) {
            Operation operation = selectOperation();
            if (operation == null) {
                break;
            }
            System.out.println("Введите число.");
            a = scanner.nextInt();

        }
    }

    private Operation selectOperation() {
        Store store = new Store();
        showMenu();
        System.out.println("Выберите операцию.");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                return new store.getAllProducts();
            case 2:
                return new store.addProduct();
            case 3:
                return new store.deleteProduct();
            case 4:
                return new store.editProduct();
            case 0:
                return null;
            default:
                System.out.println("Нет такой операции! Повторите ввод.");
                return selectOperation();
        }
    }

    private void showMenu() {
        System.out.println("1 - Список товаров.");
        System.out.println("2 - Добавить товар.");
        System.out.println("3 - Удалить товар.");
        System.out.println("4 - Редактировать товар.");
        System.out.println("0 - Выход.");
    }
}
