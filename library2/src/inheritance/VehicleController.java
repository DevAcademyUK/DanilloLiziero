package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleController {

    List<Vehicle> parking = new ArrayList<>();

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        VehicleController vc = new VehicleController();
        vc.menu();
    }

    public void menu(){
        System.out.println("Which vehicle would you like to create today?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");
        int input = Integer.parseInt(myScanner.nextLine());

        switch(input){
            case 1:
                createCar(askMaker(), askModel(), askColor());
                break;
            case 2:
                createBus();
                break;
            case 3:
                createTruck();
                break;
            case 4:
                createTrain();
                break;
            case 5:
                createMotorbike();
                break;
            case 6:
                createBicycle();
                break;
            default:
                System.out.println("You typed an invalid option. Try again.");
                menu();
        }
    }

    public String askMaker() {
        System.out.println("What is the vehicle's maker?");
        String maker = myScanner.nextLine();
        return maker;
    }

    public String askModel() {
        System.out.println("What is the vehicle's model?");
        String model = myScanner.nextLine();
        return model;
    }

    public String askColor(){
        System.out.println("What is the vehicle's color?");
        String color = myScanner.nextLine();
        return color;
    }

    public void createCar(String maker, String model, String color){
        Car c = new Car((short)5, (short)4, maker, model, color);
        c.maker = maker;
        c.model = model;
        c.color = color;
        c.accelerate();
        c.steer("Right");
        c.brake();
        System.out.println("Maker: " + maker + "\n" +
                "Model: "+ model + "\n" +
                "Color: "+ color + "\n" +
                "Seats: " + c.numberOfSeats + "\n" +
                "Wheels: " + c.numberOfWheels);
        parking.add(c);
        for(Vehicle str : parking)
            System.out.println(str);
        menu();
    }

    public void createBus(){
        Bus b = new Bus((short)50, (short)6);
        b.accelerate();
        b.steer("Right");
        b.brake();
        menu();
    }

    public void createTruck(){
        Truck t = new Truck((short)3, (short)6);
        t.accelerate();
        t.steer("Right");
        t.brake();
        menu();
    }

    public void createTrain(){
        Train t = new Train((short)320, (short)60);
        t.accelerate();
        t.steer("Left");
        t.brake();
        menu();
    }

    public void createMotorbike(){
        Motorbike m= new Motorbike((short)1, (short)2);
        m.accelerate();
        m.steer("Left");
        m.brake();
        menu();
    }

    public void createBicycle(){
        Bicycle b = new Bicycle((short)1, (short)2);
        b.accelerate();
        b.steer("Left");
        b.brake();
        menu();
    }
}
