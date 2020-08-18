package org.example.music.app.library.model;

/**
 * @author abukata
 */
public class ArtistModel {
    private final int artistId;
    private final String title;

    public ArtistModel(int artistId, String title) {
        this.artistId = artistId;
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getTitle() {
        return title;
    }
}
