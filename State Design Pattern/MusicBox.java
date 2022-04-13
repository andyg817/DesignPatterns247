import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 * General music box that calls all other music
 * @author Andrew Garcia
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;
/**
 * Contructor for all global variables in mucix box
 */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }
/**
 * Changes state to play star song
 */
    public void pressStarButton() {
        state.pressStarButton();
    }
/**
 * Changes state to play happy son
 */
    public void pressHappyButton() {
        state.pressHappyButton();
    }
/**
 * Changes state to english
 */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }
/**
 * Changes state to french
 */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
/**
 * Changes state to spanish
 */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
/**
 * Sets state of program
 * @param state
 */
    public void setState(State state) {
        this.state = state;
    }
/**
 * Return english state
 * @return englishState
 */
    public State getEnglishState() {
        return englishState;
    }
/**
 * Return french state
 * @return frenchstate
 */
    public State getFrenchState() {
        return frenchState;
    }
/**
 * Return spanish state
 * @return spanishstate
 */
    public State getSpanishState() {
        return spanishState;
    }
/**
 * Loops through the input Arraylist of lyrics and displays them in a timely order
 * @param songName name of song displayed
 * @param lyrics lyrics of song
 */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println(songName + "\n");
        for(int i = 0; i < lyrics.size(); i++) {
            sleep(1000);
            System.out.println(lyrics.get(i) + "\n");
        }
    }
/**
 * Delays time for loop
 * @param num time spaced out
 */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
}
