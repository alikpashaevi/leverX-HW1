import example.Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist p1 = new Playlist("My Mix");

        p1.addSong("Shape of You", "Ed Sheeran");
        p1.addSong("Blinding Lights", "The Weeknd");
        p1.addSong("Levitating", "Dua Lipa");

        System.out.println("Playlist Info");
        p1.getShowInfo().action();

        System.out.println("Playing All Songs");
        p1.playAll();

//        System.out.println("Playing a Song Using Functional Interface");
//        p1.getExternalSongPlayer().playSong("gangnam style", "psy");

    }
}
