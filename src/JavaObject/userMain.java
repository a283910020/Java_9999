package JavaObject;

import java.util.Scanner;

public class userMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "";

        while (!userDriver.isValidUsername(username)){
            System.out.println("please input the username: ");
            username = input.nextLine();
        }

//        System.out.println(username);

        String password = "";

        while (!userDriver.isValidpassword(password)){
            System.out.println("please input the password: ");
            password = input.nextLine();
        }

        System.out.println(userDriver.checkType(password));
//        System.out.println(password);

        String email = "";

        while (!userDriver.isValidEmail(email)){
            System.out.println("please input the email: ");
            email = input.nextLine();
        }


        User qin = new User(username, password, email);
        System.out.println("these are the information of " + qin.getUsername());
        System.out.println(qin.getUsername());
        System.out.println(qin.getPassword());
        System.out.println(userDriver.checkType(qin.getPassword()));
        System.out.println(qin.getEmail());


    }



}
