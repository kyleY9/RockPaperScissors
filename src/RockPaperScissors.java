public class RockPaperScissors {

    private String playerInput;
    private String compInput;

    public RockPaperScissors(String playerInput) {
        this.playerInput = playerInput;
    }

    public void setCompInput() {
        int rand = (int) (Math.random() * 3);
        if (rand == 2) {
            compInput = "scissors";
        } else if (rand == 1) {
            compInput = "paper";
        } else {
            compInput = "rock";
        }
    }

    public String getCompInput() {
        return compInput;
    }

    public void game() {
        if (playerInput.equals(compInput)) {
            System.out.println("It's a tie!");
        } else if (playerInput.equals("rock")) {
            if (compInput.equals("scissors")) {
                System.out.println("Rock beats scissors, you win!");
            } else {
                System.out.println("Rock is beaten by paper, you lose!");
            }
        } else if (playerInput.equals("paper")) {
            if (compInput.equals("rock")) {
                System.out.println("Paper beats rock, you win!");
            } else {
                System.out.println("Paper is beaten by scissors, you lose!");
            }
        } else {
            if (compInput.equals("paper")) {
                System.out.println("Scissor beats paper, you win!");
            } else {
                System.out.println("Scissors is beaten by rock, you lose!");
            }
        }
    }
}
