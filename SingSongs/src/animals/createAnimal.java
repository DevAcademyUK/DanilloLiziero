package animals;

import java.util.Scanner;

public class createAnimal {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAnimal ans = new createAnimal();
        ans.getAnimalType();
    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create. Please try again.");
        }
    }

    private void createDog() {
        System.out.println("What is the dog's name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        System.out.println("Does it have a tail?");
        boolean hasTail = myScanner.nextBoolean();
        dog myDog = new dog(name, size, age, breed, hasTail);

        System.out.println(myDog.makeNoise(size));
        System.out.println(myDog.play(breed));
        System.out.println(myDog.beHuman(name, age, breed));
        System.out.println(myDog.wagTail(hasTail));
    }

    private void createCat() {
        System.out.println("What is the cat's name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the cat?");
        String size = myScanner.nextLine();
        System.out.println("How old is the cat?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("What breed is the cat?");
        String breed = myScanner.nextLine();
        System.out.println("Does it have a tail?");
        boolean hasTail = myScanner.nextBoolean();
        cat myCat = new cat(name, size, age, breed, hasTail);

        System.out.println(myCat.makeNoise(size));
        System.out.println(myCat.play(breed));
        System.out.println(myCat.beHuman(name, age, breed));
        System.out.println(myCat.wagTail(hasTail));
    }
}
