package assessment01;

import java.util.Scanner;

public class cash {

    Scanner myScanner = new Scanner(System.in);
    user myUser = new user("Danilo", 4040, 500.0, 8000.0, 480.0);

    //method to print a line and wait for any key to continue
    private void waiting() {
        System.out.println("Press any key to continue:");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    //method to print a menu with account options
    private void showAccountOptions() {
        System.out.println(
                "(1) Current Account\n" +
                        "(2) Savings Account\n" +
                        "(3) Joint Account");
    }
    //method to print menu options
    void mainMenu() {
        System.out.println("What would you like to do?");
        System.out.println(
                "(1) Check your Balance\n" +
                        "(2) Deposit\n" +
                        "(3) Withdraw\n" +
                        "(4) Transfer\n" +
                        "(5) Logoff");
        System.out.println("Enter an option:");
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option) {
            case 1:
                getBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                transfer();
                break;
            case 5:
                logoff();
                break;
            default:
                System.out.println("Invalid option. Try again.");
                mainMenu();
        }
    }

    //TODO a getBalance method has to be created to replace this one
    private void getBalance() {
        System.out.println("Which account would you like to check?");
        showAccountOptions();
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option) {
            case 1:
                System.out.println("Your current balance (Current Account) is: " + myUser.currentBalance);
                break;
            case 2:
                System.out.println("Your current balance (Savings Account) is: " + myUser.savingsBalance);
                break;
            case 3:
                System.out.println("Your current balance (Joint Account) is: " + myUser.jointBalance);
                break;
        }
        waiting();
        mainMenu();
    }

    //method to deposit money
    private void deposit() {
        System.out.println("Inform the amount:");
        double amount = Double.parseDouble(myScanner.nextLine());
        System.out.println("Which account would you like to deposit in?");
        showAccountOptions();
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option) {
            case 1:
                myUser.currentBalance += amount;
                System.out.println("Your new balance is: " + myUser.currentBalance);
                break;
            case 2:
                myUser.savingsBalance += amount;
                System.out.println("Your new balance is: " + myUser.savingsBalance);
                break;
            case 3:
                myUser.jointBalance += amount;
                System.out.println("Your new balance is: " + myUser.jointBalance);
                break;
        }
        waiting();
        mainMenu();
    }

    //method to withdraw money
    private void withdraw() {
        System.out.println("Inform the amount:");
        double amount = Double.parseDouble(myScanner.nextLine());
        System.out.println("Which account would you like to withdraw from?");
        showAccountOptions();
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option) {
            case 1:
                if (myUser.currentBalance >= amount) {
                    myUser.currentBalance -= amount;
                    System.out.println("Your new balance is: " + myUser.currentBalance);
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Current Account: " + myUser.currentBalance);
                }
                waiting();
                mainMenu();
                break;
            case 2:
                if (myUser.savingsBalance >= amount) {
                    myUser.savingsBalance -= amount;
                    System.out.println("Your new balance is: " + myUser.savingsBalance);
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Savings Account: " + myUser.savingsBalance);
                }
                break;
            case 3:
                if (myUser.jointBalance >= amount) {
                    myUser.jointBalance -= amount;
                    System.out.println("Your new balance is: " + myUser.jointBalance);
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Joint Account: " + myUser.jointBalance);
                }
                break;
        }
        waiting();
        mainMenu();
    }

    //method to transfer money
    private void transfer() {
        System.out.println("Inform the amount: ");
        double amount = Double.parseDouble(myScanner.nextLine());

        //select the origin account
        System.out.println("Which account would you like to transfer from:");
        showAccountOptions();
        int from = Integer.parseInt(myScanner.nextLine());
        switch (from) {
            case 1:
                if (myUser.currentBalance >= amount) {
                    System.out.println("Which account would you like to transfer to:");
                    showAccountOptions();
                    int to = Integer.parseInt(myScanner.nextLine());
                    switch (to) {
                        case 1:
                            System.out.println("You can't transfer to the same account.");
                            break;
                        case 2:
                            myUser.currentBalance -= amount;
                            myUser.savingsBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                        case 3:
                            myUser.currentBalance -= amount;
                            myUser.jointBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                    }
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Current Account: " + myUser.currentBalance);
                }
                waiting();
                mainMenu();

            case 2:
                if (myUser.savingsBalance >= amount) {
                    System.out.println("Which account would you like to transfer to:");
                    showAccountOptions();
                    int to = Integer.parseInt(myScanner.nextLine());
                    switch (to) {
                        case 1:
                            myUser.savingsBalance -= amount;
                            myUser.currentBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                        case 2:
                            System.out.println("You can't transfer to the same account.");
                            break;
                        case 3:
                            myUser.savingsBalance -= amount;
                            myUser.jointBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                    }
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Savings Account: " + myUser.savingsBalance);
                }
                waiting();
                mainMenu();

            case 3:
                if (myUser.jointBalance >= amount) {
                    System.out.println("Which account would you like to transfer to:");
                    showAccountOptions();
                    int to = Integer.parseInt(myScanner.nextLine());
                    switch (to) {
                        case 1:
                            myUser.jointBalance -= amount;
                            myUser.currentBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                        case 2:
                            myUser.jointBalance -= amount;
                            myUser.savingsBalance += amount;
                            System.out.println("Your transfer has been made.");
                            break;
                        case 3:
                            System.out.println("You can't transfer to the same account.");
                            break;
                    }
                } else {
                    System.out.println("Not enough money. Try a smaller amount.");
                    System.out.println("Your current balance is: ");
                    System.out.println("Joint Account: " + myUser.jointBalance);
                }
                break;
        }
        waiting();
        mainMenu();
    }

    private void logoff() {
        access obj = new access();
        obj.logoff();
    }
}


