package app;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new PrinterImpl();

        System.out.print("Введіть текст повідомлення: ");
        String text = scanner.nextLine();

        System.out.print("Введіть ім'я відправника (або залиште порожнім для анонімного): ");
        String sender = scanner.nextLine();

        PrinterImpl.Message message = new PrinterImpl.Message(text, sender);
        printer.print(message);

        scanner.close();
    }
}
