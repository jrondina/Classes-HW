/**
 * Created by jamesrondina on 6/28/16.
 */
public class Main {

    public static void main(String[] args) {

        User mainUser = new User("Main User");

        Song song1 = new Song("Blink 182", "What's My Age Again", "Enema of the State");
        Song song2 = new Song("Daft Punk", "One More time", "Discovery");
        Song song3 = new Song("C.R.E.A.M", "Wu Tang Clan", "36 Chambers");
        Song song4 = new Song("Pink Floyd", "Money", "Dark Side of the Moon");
        Song song5 = new Song("Gorillaz", "Clint Eastwood", "Gorillaz");

        Playlist rock = new Playlist("Rock");
        rock.addSong(song1);
        rock.addSong(song4);
        rock.addSong(song5);

        Playlist other = new Playlist("Other");
        other.addSong(song2);
        other.addSong(song3);

        mainUser.addPlaylists(rock);
        mainUser.addPlaylists(other);

        mainUser.getPlaylistByName("Rock");

        rock.playAll();
        other.playAll();


    }
}
