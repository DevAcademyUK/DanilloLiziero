package Sample01;
import java.util.Scanner;

public class FirstClass{

    public static void main(String[] args){
        FirstClass c = new FirstClass();
        c.createDog();
    }

    private void createDog(){
        Scanner myScanner = new Scanner(System.in);
            System.out.println("What would you like to name your dog?");

        String name = myScanner.nextLine();
            System.out.println("Don't call me dog! My name is " + name);
    }
}
