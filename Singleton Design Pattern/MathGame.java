import java.util.*;
/**
 * Creates and plays math game
 * @author Andrew Garcia
 */
public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private String[] operands = {"+","-","*","/"};
/**
 * Initializes random, mathgame and prints welcome statement
 */
    private MathGame() {
        rand = new Random();
        MathGame mathGame;
        System.out.println("Lets have fun with Math");
    }
/**
 * Gets instance of mathgame, returns existing math game if one already exists
 * @return math game
 */
    public static MathGame getInstance() {
        if(mathGame == null) {
            System.out.println("Creating a Math Game");
            mathGame = new MathGame();
        }
        return mathGame;
    }
/**
 * plays the math game until user enters Q
 */
    public void play() {
        Scanner reader = new Scanner(System.in);
        char play;
        do {
            System.out.println("(P)lay or (Q)uit: ");
            play = reader.next().charAt(0);
            if (Character.toUpperCase(play) == 'P') {
                playRound();
            } else if (Character.toUpperCase(play) != 'P' || Character.toUpperCase(play) != 'Q') {
                System.out.println("Sorry, you must enter p or q");
            }
        }
        while(Character.toUpperCase(play) != 'Q');
        System.out.println("You won "+ score + " games!\nGoodBye");
    }
/**
 * plays a round of math game
 * @return boolean if true
 */
    private boolean playRound() {
        int randOne = rand.nextInt(100)+1;
        int randTwo = rand.nextInt(100)+1;
        int ranOp = rand.nextInt(operands.length);
        Scanner reader = new Scanner(System.in);
        System.out.println("Round answer to 1 decimal place");
        if(operands[ranOp] == "+") {
            System.out.println(randOne + " + " + randTwo + " = ");
            double randNum = randOne + randTwo;
            int answer = reader.nextInt();
            if(answer == randNum) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("The correct answer is " + randNum);
            }
        } else if(operands[ranOp] == "-") {
            System.out.println(randOne + " - " + randTwo + " = ");
            double randNum = randOne - randTwo;
            int answer = reader.nextInt();
            if(answer == randNum) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("The correct answer is " + randNum);
            }
        } else if(operands[ranOp] == "*") {
            System.out.println(randOne + " * " + randTwo + " = ");
            double randNum = randOne * randTwo;
            int answer = reader.nextInt();
            if(answer == randNum) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("The correct answer is " + randNum);
            }
        } else {
            System.out.println(randOne + " / " + randTwo + " = ");
            double randNum = randOne / randTwo;
            int answer = reader.nextInt();
            if(answer == randNum) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("The correct answer is " + randNum);
            }
        }
        return true;
    }
}
