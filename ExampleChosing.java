import java.util.Scanner;

public class ExampleChosing {
    public static void main(String[] args) {
        greetUser();
        choice();
    }

    public static void greetUser() {
        System.out.println("Ласкаво просимо!");
        System.out.println("Ця програма запитує, чи бажаєте ви продовжити.");
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Бажаєте продовжити? (так/ні): ");
        String ввідКористувача = scanner.nextLine();

        if (ввідКористувача.equalsIgnoreCase("так")) {
            System.out.println("Продовжуємо...");
        } else if (ввідКористувача.equalsIgnoreCase("ні")) {
            System.out.println("До побачення!");
            scanner.close();
            return; // Вихід з методу choice
        } else {
            System.out.println("Некоректний ввід. Будь ласка, введіть 'так' або 'ні'.");
            choice(); // Рекурсивний виклик методу choice
            return; // Вихід з методу choice після виконання рекурсивного виклику
        }

        // Код, який буде виконуватися після введення "так"
        scanner.close();
    }
}

