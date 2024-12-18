package lab7.musicplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayerApp {

    // Модель песни
    static class Song {
        private String title;
        private String artist;
        private boolean isPlaying;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
            this.isPlaying = false;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public boolean isPlaying() {
            return isPlaying;
        }

        public void play() {
            isPlaying = true;
        }

        public void stop() {
            isPlaying = false;
        }
    }

    // Представление
    static class MusicPlayerView {
        public void displayCurrentSong(Song song) {
            if (song.isPlaying()) {
                System.out.println("Currently playing: " + song.getTitle() + " by " + song.getArtist());
            } else {
                System.out.println("Currently stopped: " + song.getTitle() + " by " + song.getArtist());
            }
        }

        public void displayMessage(String message) {
            System.out.println(message);
        }
    }

    // Контроллер
    static class MusicPlayerController {
        private MusicPlayerView view;
        private List<Song> songs;
        private int currentSongIndex;

        public MusicPlayerController(MusicPlayerView view) {
            this.view = view;
            this.songs = new ArrayList<>();
            this.currentSongIndex = 0;

            // Добавляем несколько песен
            songs.add(new Song("Song 1", "Artist 1"));
            songs.add(new Song("Song 2", "Artist 2"));
            songs.add(new Song("Song 3", "Artist 3"));
        }

        public void playCurrentSong() {
            Song currentSong = songs.get(currentSongIndex);
            currentSong.play();
            view.displayCurrentSong(currentSong);
        }

        public void stopCurrentSong() {
            Song currentSong = songs.get(currentSongIndex);
            currentSong.stop();
            view.displayCurrentSong(currentSong);
        }

        public void nextSong() {
            Song currentSong = songs.get(currentSongIndex);
            currentSong.stop(); // Останавливаем текущую песню
            currentSongIndex = (currentSongIndex + 1) % songs.size(); // Переход к следующей песне
            view.displayMessage("Switched to the next song.");
            playCurrentSong();
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            String command;

            while (true) {
                System.out.println("\nEnter command (play, stop, next, exit): ");
                command = scanner.nextLine();

                switch (command.toLowerCase()) {
                    case "play":
                        playCurrentSong();
                        break;
                    case "stop":
                        stopCurrentSong();
                        break;
                    case "next":
                        nextSong();
                        break;
                    case "exit":
                        System.out.println("Exiting the music player.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Unknown command. Please try again.");
                }
            }
        }
    }

    public static void main(String[] args) {
        MusicPlayerView view = new MusicPlayerView();
        MusicPlayerController controller = new MusicPlayerController(view);
        controller.start();
    }
}