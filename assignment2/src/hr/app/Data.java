package hr.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    private static ArrayList<Employee> employees = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);


    //Method to populate the ArrayList of Employees with Sample Data
    public void populateSampleEmployeesData() {
        employees.add(new Employee("1", "Mr", "Name01", "Surname01", "01/01/1951", "Street Sample 01", "City01", "County01", "PC001", "001001001", "sample01@sample.com", "position01", "01/01/2015", "pass1"));
        employees.add(new Employee("2", "Mr", "Name02", "Surname02", "02/02/1942", "Street Sample 02", "City02", "County02", "PC002", "001001002", "sample02@sample.com", "position01", "01/02/2015", "pass2"));
        employees.add(new Employee("3", "Mr", "Name03", "Surname03", "01/01/1983", "Street Sample 03", "City03", "County03", "PC003", "001001003", "sample03@sample.com", "position01", "01/12/2015", "pass3"));
        employees.add(new Employee("4", "Mr", "Name04", "Surname04", "01/01/1944", "Street Sample 04", "City04", "County04", "PC004", "001001004", "sample04@sample.com", "position01", "01/11/2015", "pass4"));
        employees.add(new Employee("5", "Mr", "Name05", "Surname05", "01/01/1995", "Street Sample 05", "City05", "County05", "PC005", "001001005", "sample05@sample.com", "position01", "01/08/2015", "pass5"));
        employees.add(new Employee("6", "Mr", "Name06", "Surname06", "01/01/1981", "Street Sample 05", "City05", "County05", "PC005", "001001006", "sample06@sample.com", "hr", "01/08/2015", "pass6"));
        employees.add(new Employee("7", "Mr", "Name07", "Surname07", "01/01/1976", "Street Sample 05", "City05", "County05", "PC005", "001001007", "sample07@sample.com", "hr manager", "01/08/2015", "pass7"));
    }

    //Adds a new employee to the ArrayList
    private void addEmployee(Employee e) {
        this.employees.add(e);
    }

    //Creates a new employee and adds to the ArrayList
    private void addNewEmployee() {
        System.out.println("Pleae, inform the fields bellow");
        System.out.println("Employee ID");
        String employeeID = myScanner.next();
        System.out.println("Title:");
        String title = myScanner.next();
        System.out.println("Forename:");
        String forename = myScanner.next();
        System.out.println("Surname:");
        String surname = myScanner.next();
        System.out.println("DOB:");
        String dob = myScanner.next();
        System.out.println("Address:");
        String address1 = myScanner.next();
        System.out.println("Town/City:");
        String town = myScanner.next();
        System.out.println("County:");
        String county = myScanner.next();
        System.out.println("Post Code:");
        String postcode = myScanner.next();
        System.out.println("Phone:");
        String phone = myScanner.next();
        System.out.println("Email:");
        String email = myScanner.next();
        System.out.println("Position:");
        String position = myScanner.next();
        System.out.println("Start Date:");
        String startDate = myScanner.next();
        System.out.println("Password:");
        String password = myScanner.next();
        Employee e = new Employee(employeeID, title, forename, surname, dob,
                address1, town, county, postcode, phone, email, position,
                startDate, password);
        addEmployee(e);
    }

//    private void displayEmployeeByID(String id) {
//        for (Employee e : employees) {
//            if (id.equalsIgnoreCase(e.getEmployeeID())) {
//                System.out.println("Employee Profile:\n");
//                System.out.println("Employee ID: " + e.getEmployeeID() + "\n");
//                System.out.println("Employee ID: " + e.getTitle() + "\n");
//                System.out.println("Employee ID: " + e.getForename() + "\n");
//                System.out.println("Employee ID: " + e.getSurname() + "\n");
//                System.out.println("Employee ID: " + e.getDob() + "\n");
//                System.out.println("Employee ID: " + e.getAddress1() + "\n");
//                System.out.println("Employee ID: " + e.getTown() + "\n");
//                System.out.println("Employee ID: " + e.getCounty() + "\n");
//                System.out.println("Employee ID: " + e.getPostcode() + "\n");
//                System.out.println("Employee ID: " + e.getEmail() + "\n");
//                System.out.println("Employee ID: " + e.getPosition() + "\n");
//                System.out.println("Employee ID: " + e.getStartDate() + "\n");
//            }
//        }
//    }

    //Returns an ArrayList of employees
    public ArrayList<Employee> getEmployees() {

        return this.employees;
    }

    public Employee getEmployeeByID(String id) {
        for (Employee e : employees) {
            if (e.getEmployeeID().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
}
