package assessment01;

import java.util.Scanner;

public class access {

    Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {
        access a = new access();
        a.login();
    }

    //method to login
    private void login() {

        cash c = new cash();
        System.out.println("What is your name?");
        String inpName = myScanner.nextLine();
        System.out.println("What is your PIN?");
        int inpPin = myScanner.nextInt();

        if (inpName.equals(c.myUser.getName()) && inpPin == c.myUser.getPin()){
            System.out.println("Welcome " + inpName.toUpperCase());
            cash obj = new cash();
            obj.mainMenu();
        } else {
            System.out.println("Access not allowed");
            System.exit(0);
        }
    }

    //method to logoff
    public void logoff() {
        System.exit(0);
    }
}



