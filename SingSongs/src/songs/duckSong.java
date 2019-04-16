package songs;

import java.util.Scanner;

public class duckSong {

    public static void main(String[] args) {
        duckSong singing = new duckSong();
        singing.sing();
    }

    private void sing() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks went out?");
        int ducks = myScanner.nextInt();

        String word = "ducks";
        for (int i = ducks; i > 0; i--) {
            int newNum = i - 1;
            if (i == 1) {
                word = "duck";
            }
            System.out.println(i + " little " + word + "\n" +
                    "Went out one day\n" +
                    "Over the hill and far away\n" +
                    "Mother duck said:\n" +
                    "Quack, quack, quack, quack");
            if (newNum == 1) {
                word = "duck";
                System.out.println("But only " + newNum + " little " + word + " came back\n");
            } else {
                word = "ducks";
                System.out.println("But none of the " + ducks + " little " + word + " came back\n");
            }
            if (i == 1) {
                System.out.println("Sad mother duck\n" +
                        "Went out one day\n" +
                        "Over the hill and far away\n" +
                        "The sad mother duck said\n" +
                        "Quack, quack, quack\n" +
                        "And all of the " + ducks + " little ducks came back.");
            }
        }
    }
}