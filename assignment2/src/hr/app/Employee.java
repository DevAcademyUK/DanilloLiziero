package hr.app;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    //Employee FIELDS
    private String employeeID, title, forename, surname, dob,
            address1, town, county, postcode, phone, email,
            position, startDate, password;

    // Employee CONSTRUCTORS
    public Employee(String employeeID, String title, String forename, String surname, String dob, String address1, String town, String county, String postcode, String phone, String email, String position, String startDate, String password) {
        this.employeeID = employeeID;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.address1 = address1;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
        this.position = position;
        this.startDate = startDate;
        this.password = password;
    }

    // GETTERS and SETTERS
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {return forename;}

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress1() {return address1;}

    public void setAddress1(String address1) {this.address1 = address1;}

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {return postcode;}

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {return position;}

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getPassword() {return password;}

    public void setPassword(String password) {
        this.password = password;
    }

    //Overrides the toString in order to print the object into the console
    @Override
    public String toString() {
        return "ID: " + this.getEmployeeID() + "\n" +
                "Title: " + this.getTitle() + "\n" +
                "Surname: " + this.getSurname() + "\n" +
                "Forename: " + this.getForename() + "\n" +
                "Dob: " + this.getDob() + "\n" +
                "Address: " + this.getAddress1() + "\n" +
                "Town: " + this.getTown() + "\n" +
                "County: " + this.getCounty() + "\n" +
                "PostCode: " + this.getPostcode() + "\n" +
                "Phone: " + this.getPhone() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Position: " + this.getPosition() + "\n" +
                "Start Date: " + this.getStartDate() + "\n" +
                "Password: " + this.getPassword() + "\n";
    }
    //Comparators
    static Comparator<Employee> employeeIdComparator = (o1, o2) -> {
        String employee1 = o1.title;
        String employee2 = o2.title;

        return employee1.compareTo(employee2);
    };

    static Comparator<Employee> employeeTitleComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };

    static Comparator<Employee> employeeForenameComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };

    static Comparator<Employee> employeeSurnameComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeDobComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeAddressComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeTownComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeCountyComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeePostcodeComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeePhoneComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeEmailComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeePositionComparator = (o1, o2) -> {
        String employee1 = o1.title.toUpperCase();
        String employee2 = o2.title.toUpperCase();

        return employee1.compareTo(employee2);
    };
    static Comparator<Employee> employeeStartDateComparator = (o1, o2) -> 0;

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

//    static {
//        employeeIdComparator = Comparator.comparing(employee -> employee.employeeID);
//        employeeTitleComparator = Comparator.comparing(employee -> employee.title);
//        employeeForenameComparator = Comparator.comparing(employee -> employee.forename);
//        employeeSurnameComparator = Comparator.comparing(employee -> employee.surname);
//        employeeDobComparator = Comparator.comparing(employee -> employee.dob);
//        employeeAddressComparator = Comparator.comparing(employee -> employee.address1);
//        employeeTownComparator = Comparator.comparing(employee -> employee.town);
//        employeeCountyComparator = Comparator.comparing(employee -> employee.county);
//        employeePostcodeComparator = Comparator.comparing(employee -> employee.postcode);
//        employeePhoneComparator = Comparator.comparing(employee -> employee.phone);
//        employeeEmailComparator = Comparator.comparing(employee -> employee.email);
//        employeePositionComparator = Comparator.comparing(employee -> employee.position);
//        employeeStartDateComparator = Comparator.comparing(employee -> employee.startDate);
}






