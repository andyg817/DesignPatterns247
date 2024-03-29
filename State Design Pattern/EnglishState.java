import java.util.*;
/**
 * English state for music
 * @autho Andrew Garcia
 */
public class EnglishState implements State{
    private MusicBox box;
/**
 * Constructor of the english music box
 * @param box 
 */
    public EnglishState(MusicBox box) {
        this.box = box;
    }
/**
 * Fills ArrayList with english twinkle little star
 */
    public void pressStarButton() {
        String name = "Twinkle Twinkle Little Star";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Twinkle, twinkle, little star,");
        lyrics.add("How I wonder what you are!");
        lyrics.add("Up above the world so high,");
        lyrics.add("Like a diamond in the sky.");
        lyrics.add("Twinkle, twinkle, little star,");
        lyrics.add("How I wonder what you are!");
        box.playSong(name, lyrics);
    }
/**
 * Fills ArrayList with english if your happy
 */
    public void pressHappyButton() {
        String name = "If you are happy and you know it";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it clap your hands");
        box.playSong(name, lyrics);
    }
/**
 * Displays that english state is already set
 */
    public void pressEnglishButton() {
        System.out.println("You are already in English Mode");
    }
/**
 * Sets box to french state
 */
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }
/**
 * Sets box to spanish state
 */
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
