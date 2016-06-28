import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class User {

    String mName;
    HashMap<String, Playlist> mPlaylists;

    public User(String name){
        mName = name;
        mPlaylists = new HashMap<>();

    }

    public void addPlaylists(Playlist playlist) {
        mPlaylists.put(playlist.getName(), playlist);


    }
//had to sleep
    /*public List<String> getAllPlaylistNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < mPlaylists.size(); i++) {
            names.add();
        }


        return names;
        } */

    public Playlist getPlaylistByName(String name) {
        return mPlaylists.get(name);
    }
}
