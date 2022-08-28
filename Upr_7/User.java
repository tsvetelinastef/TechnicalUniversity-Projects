package Upr_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User implements ValidatePhone {
    private String name;
    private String password;
    private String phone;
    public User(){

    }
    public User(String name, String password, String phone ){
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
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
