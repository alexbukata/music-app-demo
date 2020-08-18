package org.example.music.app.library.model;

import java.util.List;

/**
 * @author abukata
 */
public class AlbumModel {
    private final int albumId;
    private final String title;
    private final List<Integer> artistIds;
    private final List<Integer> trackIds;

    public AlbumModel(int albumId, String title, List<Integer> artistIds, List<Integer> trackIds) {
        this.albumId = albumId;
        this.title = title;
        this.artistIds = artistIds;
        this.trackIds = trackIds;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getArtistIds() {
        return artistIds;
    }

    public List<Integer> getTrackIds() {
        return trackIds;
    }
}
