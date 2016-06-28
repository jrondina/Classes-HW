import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Playlist {
    String mName;
    List<Song> mSongs = new ArrayList<>();

    public Playlist(String name) {
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {
        mSongs.add(song);

    }

    public void playAll() {
        for (Song i : mSongs) {
            i.play();

        }
    }
}
