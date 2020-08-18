package org.example.music.app.library.model;

import java.util.List;

/**
 * @author abukata
 */
public class TrackModel {
    private final int trackId;
    private final String title;
    private final List<String> genreIds;

    public TrackModel(int trackId, String title, List<String> genreIds) {
        this.trackId = trackId;
        this.title = title;
        this.genreIds = genreIds;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getGenreIds() {
        return genreIds;
    }
}
