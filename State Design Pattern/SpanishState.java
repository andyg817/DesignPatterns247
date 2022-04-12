import java.util.*;
/**
 * Spanish state for music
 * @author Andrew Garcia
 */
public class SpanishState implements State{
    private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }
    public void pressStarButton() {
        String name = "Estrellita Dónde Estás";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Estrellita ¿dónde estás?");
        lyrics.add("Quiero verte a ti brillar");
        lyrics.add("Esta noche allí estarás");
        lyrics.add("Cual diamante brillarás.");
        lyrics.add("Estrellita, ¿dónde estas?");
        lyrics.add("Quiero verte a ti brillar");
        box.playSong(name, lyrics);
    }
    public void pressHappyButton() {
        String name = "Si usted esta feliz";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si usted esta feliz Apaluda las fuerte");
        lyrics.add("Si usted esta feliz Apaluda las fuerte");
        lyrics.add("Si usted esta feliz");
        lyrics.add("En su cara se vera.");
        lyrics.add("Si usted esta feliz");
        lyrics.add("Apaluda las fuerte");
        box.playSong(name, lyrics);
    }
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }
    public void pressSpanishButton() {
        System.out.println("Ya estas en espanol mode");
    }
}
