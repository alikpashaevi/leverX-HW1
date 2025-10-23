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
        p1.getPlayAll().action();


        System.out.println("Playing a Song with Functional Interface");
        p1.getPlaySong().playSong("Peaches", "Justin Bieber");

    }
}
