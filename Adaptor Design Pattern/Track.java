/**
 * Class for track music
 * @author Andrew Garcia
 */
public class Track extends Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

/**
 * Contructor for track
 * @param title title of track 
 * @param album allbum of track
 * @param firstName first name of artist
 * @param lastName last name of artitst
 * @param genre genre of track
 */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
/**
 * return title 
 */
    public String getTitle() {
        return title;
    }
/**
 * return album
 */
    public String getAlbum() {
        return album;
    }
/**
 * return artitst last name
 */
    public String getArtistFirstName() {
        return firstName;
    }
/**
 * returns artitst last name
 */
    public String getArtistLastName() {
        return lastName;
    }
/**
 * returns to string of genre
 */
    public String getGenre() {
        return genre.toString();
    }
}
