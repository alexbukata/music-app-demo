package org.example.music.app.genres;

import java.util.List;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author abukata
 */
@Component
public class GenreService {
    private final ResourceLoader resourceLoader;

    public GenreService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public List<Genre> genres() {

    }
}
