import java.text.ParseException;

public class UserInfoProcessor {

    public static void processInput(String input) throws InputFormatException, FileHandlingException {
        String[] data = input.split("\\s+");

        if (data.length != 6) {
            throw new InputFormatException("Неверное количество данных. Требуется 6 параметров.");
        }

        String surname = data[0];
        String firstName = data[1];
        String lastName = data[2];
        String birthDateStr = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];

        try {
            UserData userData = new UserData(surname, firstName, lastName, birthDateStr, phoneNumberStr, genderStr);
            FileHandler.writeUserDataToFile(userData);
        } catch (ParseException e) {
            throw new InputFormatException("Неверный формат даты рождения.");
        }
    }
}

