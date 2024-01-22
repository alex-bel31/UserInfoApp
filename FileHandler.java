import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void writeUserDataToFile(UserData userData) throws FileHandlingException {
        String fileName = userData.getSurname() + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(userData.toString() + "\n");
        } catch (IOException e) {
            throw new FileHandlingException("Ошибка при записи в файл.");
        }
    }
}
