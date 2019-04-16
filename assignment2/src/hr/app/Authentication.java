package hr.app;

import java.util.Scanner;

public class Authentication {

    private Data dt = new Data();

    private Employee user;
    private Employee selectedUser;

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Authentication session = new Authentication();
        session.login();
    }

    public void login() {
        dt.populateSampleEmployeesData();
        System.out.println("--------------------------");
        System.out.println("HR MANAGEMENT APPLICATION");
        System.out.println("--------------------------\n");
        System.out.println("Type your Employee ID");
        String inputID = myScanner.nextLine();
        System.out.println("Type your password");
        String inputPassword = myScanner.nextLine();
        user = dt.getEmployeeByID(inputID);


        if ((user.getEmployeeID().equalsIgnoreCase(inputID)) && user.getPassword().equals(inputPassword)) {
            System.out.println("Employee logged!");
            System.out.println("-------------------------------");
            System.out.println("Welcome " + user.getForename() + "(" + user.getPosition() + ")");
            System.out.println("-------------------------------");
            menu(user.getPosition()); //Defines which menu will be shown according to Position.
        } else {
            System.out.println("Login failed. Please try again");
            login();
        }
    }
    //Defines which menu will be shown according to Position.
    private void menu(String userPosition){
        switch (user.getPosition()){
            case "hr manager":
                managerMenu();
                break;
            case "hr":
                hrMenu();
                break;
            default:
                employeeMenu();
                break;
        }
    }

    private void employeeMenu(){
        System.out.println("Select an option from the list below:");
        System.out.println("1 - View your Profile\n" +
                            "2 - Edit your Profile\n" +
                            "3 - Exit");
        int option = Integer.parseInt(myScanner.next());

        switch (option){
            case 1:
                System.out.println("This is your profile:");
                System.out.println(user.toString());
                menu(user.getPosition());
                break;
            case 2:
                editProfile(user);
                break;
            case 3:
                System.exit(0);
        }
    }

    private void hrMenu(){
        System.out.println("Select an option from the list below:");
        System.out.println("1 - View your Profile\n" +
                            "2 - Edit your Profile\n" +
                            "3 - View an Employee's Profile\n" +
                            "4 - Edit an Employee's Profile\n" +
                            "5 - Edit RESTRICTED FIELDS\n" +
                            "6 - Exit");
        int option = Integer.parseInt(myScanner.next());

        switch (option) {
            case 1:
                System.out.println("This is your profile:");
                System.out.println(user.toString());
                break;
            case 2:
                editProfile(user);
                break;
            case 3:
                selectEmployee();
                System.out.println("This is " + selectedUser.getForename() + " " + selectedUser.getSurname() + " ID: " + selectedUser.getEmployeeID() );
                System.out.println(selectedUser.toString());
                menu(user.getPosition());
                break;
            case 4:
                selectEmployee();
                editProfile(selectedUser);
                break;
            case 5:
                selectEmployee();
                editRestrictedFields(selectedUser);
                break;
            case 6:
                System.exit(0);
        }
    }

    private void managerMenu() {
        System.out.println("Select an option from the list bellow:");
        System.out.println("1 - Manage your OWN Profile and/or Employees Profiles");
        System.out.println("2 - Print REPORTS");
        int inputOption = Integer.parseInt(myScanner.next());

        switch (inputOption) {
            case 1:
                hrMenu();
                break;
            case 2:
                reportsMenu();
                break;
        }
    }

    private void reportsMenu(){
        System.out.println("Select a Report from the list bellow:");
        System.out.println();
    }

    //Selects an employee to be edited and store its object in a variable selectedUser
    private Employee selectEmployee(){
        System.out.println("Inform the Employee ID of the employee: ");
        String id = myScanner.next();
        selectedUser = dt.getEmployeeByID(id);
        System.out.println("User selected");
        return selectedUser;
    }

    //Edits profiles (except the restricted fields)
    private void editProfile(Employee employee){
        System.out.println("Which field would you like to edit?");
        System.out.println("1 - title\n" +
                            "2 - forename\n" +
                            "3 - surname\n" +
                            "4 - address1\n" +
                            "5 - town\n" +
                            "6 - county\n" +
                            "7 - postcode\n" +
                            "8 - phone\n" +
                            "9 - email\n" +
                            "10 - password");
        int inputOption = Integer.parseInt(myScanner.next());

        switch (inputOption){
            case 1:
                System.out.println("Inform a new Employee Title: ");
                String newEmployeeTitle = myScanner.next();
                employee.setTitle(newEmployeeTitle);
                break;
            case 2:
                System.out.println("Inform a new Employee Forename: ");
                String newEmployeeForename = myScanner.next();
                employee.setForename(newEmployeeForename);
                break;
            case 3:
                System.out.println("Inform a new Employee Surname: ");
                String newEmployeeSurname = myScanner.next();
                employee.setSurname(newEmployeeSurname);
                break;
            case 4:
                System.out.println("Inform a new Employee Address: ");
                String newEmployeeAddress = myScanner.next();
                employee.setAddress1(newEmployeeAddress);
                break;
            case 5:
                System.out.println("Inform a new Employee Town: ");
                String newEmployeeTown = myScanner.next();
                employee.setTown(newEmployeeTown);
                break;
            case 6:
                System.out.println("Inform a new Employee County: ");
                String newEmployeeCounty = myScanner.next();
                employee.setCounty(newEmployeeCounty);
                break;
            case 7:
                System.out.println("Inform a new Employee Postcode: ");
                String newEmployeePostcode = myScanner.next();
                employee.setPostcode(newEmployeePostcode);
                break;
            case 8:
                System.out.println("Inform a new Employee Phone: ");
                String newEmployeePhone = myScanner.next();
                employee.setPhone(newEmployeePhone);
                break;
            case 9:
                System.out.println("Inform a new Employee Email: ");
                String newEmployeeEmail = myScanner.next();
                employee.setEmail(newEmployeeEmail);
                break;
            case 10:
                System.out.println("Inform a new Employee Password: ");
                String newEmployeePassword = myScanner.next();
                employee.setPassword(newEmployeePassword);
                break;
        }
        System.out.println("Profile updated");
        System.out.println("Would you like to edit any other field?");
        String inputOption3 = myScanner.next();
        if (inputOption3.equalsIgnoreCase("Y"))
            editProfile(selectedUser);
        else
            menu(user.getPosition());
    }

    //Edits restricted fields (dob, employee id, position and start date)
    private void editRestrictedFields(Employee employee) {
        System.out.println("Which field would you like to edit?");
        System.out.println("1 - employeeID\n" +
                            "2 - dob\n" +
                            "3 - position\n" +
                            "4 - startDate");
        int inputOption = Integer.parseInt(myScanner.nextLine());

        switch (inputOption) {
            case 1:
                System.out.println("Inform a new Employee ID: ");
                String newEmployeeID = myScanner.next();
                selectedUser.setEmployeeID(newEmployeeID);
                System.out.println("Field updated");
                break;
            case 2:
                System.out.println("Inform a new Employee DOB: ");
                String newEmployeeDob = myScanner.next();
                selectedUser.setDob(newEmployeeDob);
                System.out.println("Field updated");
                break;
            case 3:
                System.out.println("Inform a new Employee Position: ");
                String newEmployeePosition = myScanner.next();
                selectedUser.setPosition(newEmployeePosition);
                System.out.println("Field updated");
                break;
            case 4:
                System.out.println("Inform a new Employee Start Date: ");
                String newEmployeeStartDate = myScanner.next();
                selectedUser.setStartDate(newEmployeeStartDate);
                System.out.println("Field updated");
                break;
        }
    }
}