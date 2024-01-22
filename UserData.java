import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserData {

    private String surname;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private long phoneNumber;
    private char gender;

    public UserData(String surname, String firstName, String lastName, String birthDateStr,
                    String phoneNumberStr, String genderStr) throws ParseException, InputFormatException {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.birthDate = dateFormat.parse(birthDateStr);

        this.phoneNumber = Long.parseLong(phoneNumberStr);

        if (genderStr.length() != 1 || (genderStr.charAt(0) != 'f' && genderStr.charAt(0) != 'm')) {
            throw new InputFormatException("Неверный формат пола. Используйте 'f' или 'm'.");
        }

        this.gender = genderStr.charAt(0);
    }


    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s> <%d><%c>", surname, firstName, lastName,
                birthDate, phoneNumber, gender);
    }

}
