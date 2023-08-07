package Library;

import java.util.Scanner;

public class Main {
    static Scanner s;
    static Database database;

    public static void main(String[] args) {

        database = new Database();

        System.out.println("Welcome to Library Management System!\n");
        int choice;
        do {
            System.out.println("0. Exit\n1. Login \n2. New User\n");
            s = new Scanner(System.in);
            choice = s.nextInt();

            switch(choice) {
                case 1: login();
                case 2: newUser();
            }
        }while(choice != 0);

    }

    private static void login() {
        System.out.println("Enter phone number: ");
        String phoneNumber = s.next();
        System.out.println("Enter email: ");
        String email = s.next();
        int n = database.login(phoneNumber, email);
        if( n != -1) {
            User user = database.getUser(n);
            user.menu(database, user);
        }else {
            System.out.println("User doesn't exist");
        }

    }

    private static void newUser() {
        System.out.println("Enter name : ");
        String name = s.next();
        System.out.println("Enter phone number : ");
        String phoneNumber = s.next();
        System.out.println("Enter email : ");
        String email = s.next();
        System.out.println("\n1. Admin\n2. Normal User");

        int choiceUserType = s.nextInt();
        User user;
        if(choiceUserType == 1) {
            user = new Admin(name, email, phoneNumber);

        }
        else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.addUser(user);
        System.out.println("User created successfully!");
        user.menu(database, user);


    }

}
