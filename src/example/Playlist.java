package example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Playlist {
    private String name;
    private List<String[]> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    ExternalSongPlayer playAll = new ExternalSongPlayer() {
        @Override
        public void action() {

            for (String[] song : songs) {
                System.out.println("Playing: " + song[0] + " by " + song[1]);
            }
        }
    };

    public void addSong(String title, String artist) {
        songs.add(new String[]{title, artist});
    }

    ExternalSongPlayer showInfo = new ExternalSongPlayer() {
        @Override
        public void action() {
            System.out.println("Playlist Name: " + name );
            System.out.println("Number of songs: " + songs.size());
        }
    };

}