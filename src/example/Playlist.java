package example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public class Song {
        private String title;
        private String artist;


        public void play() {
            System.out.println("Playing: " + title + " by " + artist + " from playlist " + name);
        }

        public void addToPlaylist() {
            songs.add(this);
        }
    }

    public static class PlaylistInfo {
        public static void showPlaylistInfo(Playlist playlist) {
            System.out.println("Playlist name: " + playlist.getName());
            System.out.println("Number of songs: " + playlist.getSongs().size());
        }
    }

    public void playAll() {
        class SongPlayer {
            void playSong(Song song) {
                song.play();
            }
        }

        SongPlayer player = new SongPlayer();
        for (Song song : songs) {
            player.playSong(song);
        }
    }

    ExternalSongPlayer externalSongPlayer = new ExternalSongPlayer() {
        @Override
        public void playSong(String title, String artist) {
            System.out.println("Playing song:"  + title + " by " + artist + " outside of your playlist");
        }
    };

}