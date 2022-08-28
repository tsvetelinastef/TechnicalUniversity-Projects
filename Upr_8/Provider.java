package Upr_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Provider implements ValidatePhone {
    private String name;
    private String phoneNumber;


    public Provider() {
        this.setName("");
        this.setPhoneNumber("");

    }

    public Provider(String name, String phoneNumber) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        Pattern pattern;
        Matcher matcher;

        final String PHONE_PATTERN = "^[0-9]{9,13}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(phoneNumber);
        if (matcher.matches() == true) {
            return matcher.matches();
        } else {
            throw new WrongPhoneNumberException();
        }

    }


}
