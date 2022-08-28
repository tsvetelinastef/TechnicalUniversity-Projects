package Upr_7;


public class WrongUserException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong username!";
    }
}
