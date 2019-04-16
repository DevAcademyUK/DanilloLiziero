package switches;

import java.util.Scanner;

public class position {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){

        position p = new position();
        p.getInput();
    }

    private void getInput(){
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the College? (Staff/Student/Visitor");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position){

        int cost;
        int hourlyrate = 0;
        int multiplier = 0;

        switch (position){
            case "Staff":
                multiplier = 2;
                break;

            case "Student":
                multiplier = 1;
                break;

            case "Visitor":
                multiplier = 3;
                break;

            default:
                System.out.println("Unexpected error. Try it again.");
                getInput();

        }
        switch (day) {
            case "Monday":
                hourlyrate = 2;
                break;

            case "Tuesday":
                hourlyrate = 2;
                break;

            case "Wednesday":
                hourlyrate = 3;
                break;

            case "Thursday":
                hourlyrate = 2;
                break;

            case "Friday":
                hourlyrate = 3;
                break;

            case "Saturday":
                hourlyrate = 4;
                break;

            case "Sunday":
                hourlyrate = 5;
                break;

            default:
                System.out.println("Unexpected error. Try it again.");
                getInput();
        }
        cost = (hourlyrate * multiplier) * duration;
        System.out.println("Thanks for parking at Gateshead College, Please Pay: £" + cost);
    }


}
