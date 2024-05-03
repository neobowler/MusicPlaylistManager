/**
 * The Playlist class represents a playlist containing a collection of songs.
 * Each playlist has a name, a list of songs, and a total duration.
 * Songs can be added to or removed from the playlist.
 * The playlist can also display its contents and search for a song by title.
 */

import java.util.LinkedList;

public class Playlist {
    private String name;
    private int numberOfSongs; // Number of songs in the playlist
    private LinkedList<Song> songs;
    private int totalDuration; // Total duration of all songs in the playlist, in seconds
    private SongNode head; // Head of the linked list

    // Constructor
    public Playlist(String name) {
        this.name = name;
        this.numberOfSongs = 0;
        this.songs = new LinkedList<>();
        this.totalDuration = 0;
        this.head = null;
    }

    /**
     * Implement method to add a song to the playlist
     * 1. Create a new SongNode object with the provided song
     * 2. If the playlist is empty (head is null), set the new node as the head
     * 3. Otherwise, traverse to the last node in the playlist
     * 4. Link the new node to the last node
     * 5. Update the total duration of the playlist by adding the duration of the provided song
     * 6. Increment the count of songs in the playlist
     */
    public void addSong(Song song) {
        // Write your code here
    }

    /**
     * Implement method to remove a song from the playlist
     * 1. Check if the given song is present in the list of songs
     * 2. Remove the song
     * 3. Update the total duration of the playlist
     * 4. Decrement the count of songs
      */
    public void removeSong(Song song) {
        // Write your code here
    }

    // Method to get all songs on the playlist
    public void showPlaylist() {
        int minutes = totalDuration / 60;
        int seconds = totalDuration % 60;
        String formattedSeconds = (seconds < 10) ? "0" + seconds : String.valueOf(seconds);

        System.out.println("\nPlaylist: " + name);
        System.out.println("Total Duration: " + minutes + ":" + formattedSeconds + " mins");
        System.out.println("Number of Songs: " + numberOfSongs);
        System.out.println("Songs:");

        SongNode current = head; // Start from the head of the playlist

        // Traverse the playlist and display each song
        while (current != null) {
            Song song = current.getSong(); // Get the song from the current node
            int duration = song.getDuration();
            int min = duration / 60;
            int sec = duration % 60;
            String formattedSec = (sec < 10) ? "0" + sec : String.valueOf(sec);

            System.out.println(song.getTitle() + " - " + song.getArtist() + " (" + min + ":" + formattedSec + ")");
            current = current.getNext(); // Move to the next node
        }
    }

    /**
     * Implement method to find a song by its title
     * 1. Iterate through the linked list of songs in the playlist
     * 2. Start from the beginning of the playlist and traverse until you reach the end of the list
     *      i. At each iteration, check if the title of the current song matches the given songTitle
     *      ii. If a match is found, return the song
     * 3. If no match is found after traversing the entire list, return null to indicate that the song was not found
      */
    public Song findSongByTitle(String songTitle) {
        // Write your code here
    }
}