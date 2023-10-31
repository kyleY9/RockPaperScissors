import java.util.Scanner;
public class RockPaperScissorsRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Remember: Rock beats Scissors, Paper Beats Rock, Scissor beats Paper");
        System.out.print("Mr.Computer has decided, choose now (rock, paper, scissors, all lower): ");
        String userInput = scan.nextLine();

        RockPaperScissors obj = new RockPaperScissors(userInput);
        obj.setCompInput();
        System.out.println("Your choice: " + userInput);
        System.out.println("Mr. Computer's choice: " + obj.getCompInput());
        obj.game();


    }
}
