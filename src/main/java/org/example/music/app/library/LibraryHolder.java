package org.example.music.app.library;

import javax.annotation.PostConstruct;

import org.example.music.app.library.model.ModelParser;
import org.springframework.stereotype.Component;

/**
 * @author abukata
 */
@Component
public class LibraryHolder {
    private final ModelParser modelParser;

    private Library library;

    public LibraryHolder(ModelParser modelParser) {
        this.modelParser = modelParser;
    }

    @PostConstruct
    private void init() {
    }
}
