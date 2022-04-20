/**
 * Oldie class of songs
 * @author Andrew Garcia
 */
public class Oldie implements Tune{
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

/**
 * Contructor for oldie
 * @param artistName
 * @param songTitle
 * @param recordTitle
 * @param category
 */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
/**
 * returns artist name
 */
    public String getArtistName() {
        return artistName;
    }
/**
 * returns song title and record title
 */
    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }
/**
 * returns category of oldie
 */
    public String getCategory() {
        return category;
    }
}
