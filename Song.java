/**
 * Created by jamesrondina on 6/28/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;

    public Song(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println(mArtistName + " - " + mSongName + ", " + mAlbumName);
    }
}
