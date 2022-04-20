/**
 * Abstract class for Song
 * @author Andrew Garcia
 */
public abstract class Song {
/**
 * returns title
 * @return
 */
    public abstract String getTitle();
/**
 * returns album
 * @return
 */
    public abstract String getAlbum();
/**
 * returns first name
 * @return
 */
    public abstract String getArtistFirstName();
/**
 * returns last name
 * @return
 */
    public abstract String getArtistLastName();
/**
 * returns genre
 * @return
 */
    public abstract String getGenre();
/**
 * to string for song
 * @return
 */
    public String toString() {
        return getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " 
        + getArtistFirstName() + " " + getArtistLastName() + "\nGenre: " + getGenre();
    }
}
