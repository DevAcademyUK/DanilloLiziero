package games;

import java.util.Random;
import java.util.Scanner;

// creates a class, creates instance variables
public class rockPaperScissors {

    String playerName;
    String playerMove;
    String computerMove;
    int score;
    Scanner myScanner = new Scanner(System.in);
    //creates an instance of the object rockPaperScissors
    public static void main(String[] args){
        rockPaperScissors rps = new rockPaperScissors();
        rps.initialiseGame();
    }

    //ask for player's name
    private void initialiseGame(){
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame();
    }

    private void playGame(){
        System.out.println("Enter your move: "); // ask for a move (rock, paper or scissors
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove(); //call function to generate a computer move
        String result = getWinner(playerMove, computerMove); //call function passing moves as parameters

        //compare strings ignoring cases and updates the scores
        if(result.equalsIgnoreCase("Win")){
            System.out.println("Congratulations, you won this round!");
            score++;
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!");
        }

        // the first to win 3 rounds wins the game
        if(score < 3 && score > -3){
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!");
        }

    }
    //generates a random move and assign it as the computer move
    private String generateComputerMove() {
        Random r = new Random();
        String move = "";
        int i = r.nextInt(3); // generates a random number (0, 1 or 2)
        switch(i){ //assigns a move (string) according to the random number generated
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }
    //pass both moves as parameters and compares the strings ignoring case
    private String getWinner(String playerMove, String computerMove){
        String outcome = "";
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome;
    }
}