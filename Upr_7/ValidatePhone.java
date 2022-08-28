package Upr_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public interface ValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException{
        String regex = "[0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean flag = false;
        if(matcher.find()){
            flag = true;
        }else{
            throw new WrongPhoneNumberException();
        }
        return flag;
    }
}
