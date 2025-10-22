import example.Playlist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> songs = List.of("Blinding lights", "Smooth Criminal", "Monster");
        Playlist p1 = new Playlist("My Mix", songs);

        p1.playAll();
    }
}