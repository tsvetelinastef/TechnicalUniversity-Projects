package Upr_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For creating new account press1\n\n" +
                "\tTo sign up press 2");
        int n = Integer.parseInt(scanner.nextLine());
        List<User> users = new ArrayList<>();
        if(n == 1){
            System.out.println("Insert name");
            String name = scanner.nextLine();
            for(User u: users){
                if(u.getName().equals(name)){
                    System.out.println("The name already exists!");
                    break;
                }
            }
            System.out.println("Insert pass");
            String password = scanner.nextLine();
            System.out.println("Insert phone number");
            String phoneNumber = scanner.nextLine();
            boolean nameFine = false;
            boolean passFine = false;
            boolean phoneFine = false;
            if(ValidateName.validateName(name)){
                nameFine = true;
            }
            if(ValidatePassword.validatePass(password)){
                passFine = true;
            }
            if(User.validatePhoneNumber(phoneNumber)){
                phoneFine = true;
            }
            if(!passFine || !nameFine){
                throw  new WrongUserException();
            }
            if(passFine && phoneFine && nameFine){
                users.add(new User(name, password, phoneNumber));
            }

        }else if (n == 2){
            System.out.println("Insert name");
            String name = scanner.nextLine();
            System.out.println("Insert pass");
            String pass = scanner.nextLine();
            boolean flag = true;
            for(User u: users){
                if(u.getName().equals(name) && u.getPassword().equals(pass)){
                    System.out.println("You are in");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("The given account could not be found!");
            }
        }
    }
}
