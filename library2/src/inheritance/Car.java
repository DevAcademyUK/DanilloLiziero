package inheritance;

public class Car extends SteeringWheel{

    public Car(short numberOfSeats, short numberOfWheels, String maker, String model, String color){
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.maker = maker;
        this.model = model;
        this.color = color;
    }

}