import java.util.Scanner;

public class UserInfoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные (Фамилия|Имя|Отчество дата|рождения номер|телефона пол(m/f), разделяя пробелами):");
        String input = scanner.nextLine();

        try {
            UserInfoProcessor.processInput(input);
            System.out.println("Данные введены верно и записаны в файл.");
        } catch (InputFormatException | FileHandlingException e) {
            System.err.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
