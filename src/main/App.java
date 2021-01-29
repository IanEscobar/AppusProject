package main;

import Users.LocalUserDB;

import java.util.Scanner;

public class App {

    public static void main( String [] args){
        LocalUserDB userDB = new LocalUserDB();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose a option");
            System.out.println("1 - Add user");
            System.out.println("2 - Remove user by id");
            System.out.println("3 - Show all users");
            System.out.println("4 - Exit");


            Integer option = s.nextInt();

            switch(option){
                case 1:
                    System.out.print("User name:");
                    s.nextLine();
                    String currUser = s.nextLine();
                    Integer currId = userDB.addUser(currUser);
                    System.out.println("User " + currUser + " with id " + currId);
                    break;
                case 2:
                    System.out.println("User id to be removed:");
                    userDB.removeUserById(s.nextInt());
                    break;
                case 3:
                    userDB.print();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Choose a valid option");
                    break;
            }

        }
    }
}
