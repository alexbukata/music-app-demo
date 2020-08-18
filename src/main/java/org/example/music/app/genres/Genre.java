package org.example.music.app.genres;

import java.util.List;

import org.example.music.app.tracks.Track;

/**
 * @author abukata
 */
public class Genre {
    private final String title;
    private final List<Track> tracks;

    public Genre(String title, List<Track> tracks) {
        this.title = title;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
