package example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Playlist {
    private String name;
    private List<String> songs;

    public void playAll() {
        System.out.println("Playing all songs in playlist: " + name);
        for (String song : songs) {
            System.out.println("Playing: " + song);
        }
    }

}
