import java.util.Scanner;

class RockPaperScissors {
    //global variables here
    static Scanner sc = new Scanner(System.in);
    static final int ROCK = 1, PAPER = 2, SCISSORS = 3;
    static int wins = 0, losses = 0, ties = 0;
    static int humanMove, computerMove;

    public static void main (String[] args) {
        intro();
        do {
            getHumanMove();
            getComputerMove();
            printChoices();
            decideWinner();

        } while (playAgain());
        printStats();   

    }

    public static void intro() {
        System.out.println("RPS 1.0");
        System.out.println("*********************************************************");
        System.out.println("Good luck human");
        System.out.println("");
    }

    public static void getHumanMove() {
        System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
        humanMove  = sc.nextInt();
    }

    public static void getComputerMove() {
        computerMove = (int) (Math.random()*3 + 1); 
    }

    public static void printChoices() {
        if(humanMove == ROCK){
            System.out.print("You threw rock! ");
        }else if(humanMove == PAPER){
            System.out.print("You threw paper! ");
        }else if(humanMove == SCISSORS){
            System.out.print("You threw scissors! ");
        }

        if(computerMove == ROCK){
            System.out.println("I threw rock!");
        }else if(computerMove == PAPER){
            System.out.println("I threw paper!");
        }else if(computerMove == SCISSORS){
            System.out.println("I threw scissors!");
        }

    }

    public static void decideWinner() {
        if(humanMove == computerMove){
            System.out.println("It's a tie. ");
            ties++;
        }else if(humanMove == ROCK && computerMove == SCISSORS || humanMove == SCISSORS && computerMove == PAPER || humanMove == PAPER && computerMove == ROCK){
            System.out.println("You win. ");
            wins++; 
        }else{
            System.out.println("I win. ");
            losses++;
        }
    }

    public static boolean playAgain() {
        System.out.println("");
        System.out.print("Play again? [y,n]: ");
        String answer = sc.next();
        return answer.equals("Y") || answer.equals("y"); 
    }

    public static void printStats () {
        System.out.println("");
        System.out.println("Good Game! Thanks for playing. ");
        System.out.println("*********************************************************");
        System.out.println("Wins: " + wins);  
        System.out.println("Losses: " + losses);  
        System.out.println("Ties: " + ties);  
    }    

}
