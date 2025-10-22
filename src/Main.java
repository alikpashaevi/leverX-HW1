import example.Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist p1 = new Playlist("My Mix");

        Playlist.Song s1 = p1.new Song();
        s1.setArtist("Linkin Park");
        s1.setTitle("Papercut");
        s1.addToPlaylist();

        Playlist.Song s2 = p1.new Song();
        s2.setArtist("The Weeknd");
        s2.setTitle("Montreal");
        s2.addToPlaylist();

        System.out.println("Playlist Info");
        Playlist.PlaylistInfo.showPlaylistInfo(p1);

        System.out.println("Playing All Songs");
        p1.playAll();

        System.out.println("Playing a Song Using Functional Interface");
        p1.getExternalSongPlayer().playSong("gangnam style", "psy");

    }
}
