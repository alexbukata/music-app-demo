package org.example.music.app.library;

import java.util.List;

import org.example.music.app.library.model.AlbumModel;
import org.example.music.app.library.model.ArtistModel;
import org.example.music.app.library.model.TrackModel;

/**
 * @author abukata
 */
public class Library {
    private final List<ArtistModel> artists;
    private final List<AlbumModel> albums;
    private final List<TrackModel> tracks;

    public Library(List<ArtistModel> artists, List<AlbumModel> albums,
                   List<TrackModel> tracks
    ) {
        this.artists = artists;
        this.albums = albums;
        this.tracks = tracks;
    }

    public List<ArtistModel> getArtists() {
        return artists;
    }

    public List<AlbumModel> getAlbums() {
        return albums;
    }

    public List<TrackModel> getTracks() {
        return tracks;
    }
}
