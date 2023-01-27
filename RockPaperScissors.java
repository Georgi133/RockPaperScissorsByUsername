import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.nextLine();
        if (playerMove.equals("r")||playerMove.equals("rock")){
            playerMove=ROCK;

        }else if(playerMove.equals("p")||playerMove.equals("paper")){
            playerMove=PAPER;

        }else if(playerMove.equals("s")||playerMove.equals("scissors")){
            playerMove=SCISSORS;

        }else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNum= random.nextInt(1,4);
        String computerMove="";
        switch (computerRandomNum){
            case 1:
                computerMove="Rock";
                break;
            case 2:
                computerMove="Paper";
                break;
            case 3:
                computerMove="Scissors";
                break;
        }
        System.out.printf("The computer chose %s.%n",computerMove);
        if(playerMove.equals(ROCK)&&computerMove.equals(SCISSORS)||playerMove.equals(PAPER)&&computerMove.equals(ROCK)
        ||playerMove.equals(SCISSORS)&&computerMove.equals(PAPER)){
            System.out.println("You win.");
        }else if (computerMove.equals(ROCK)&&playerMove.equals(SCISSORS)||computerMove.equals(PAPER)&&playerMove.equals(ROCK)
                ||computerMove.equals(SCISSORS)&&playerMove.equals(PAPER)){
            System.out.println("You lose.");
        }else{
            System.out.println("This game was a draw.");
        }

    }

     static final String ROCK = "Rock";
     static final String PAPER = "Paper";
     static final String SCISSORS = "Scissors";
}