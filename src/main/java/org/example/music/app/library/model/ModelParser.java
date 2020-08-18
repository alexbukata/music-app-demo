package org.example.music.app.library.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author abukata
 */
@Component
public class ModelParser {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final ResourceLoader resourceLoader;

    public ModelParser(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public <T> T parse(String source, Class<T> clazz) {
        Resource resource = resourceLoader.getResource(source);
        try (var is = resource.getInputStream()) {
            return OBJECT_MAPPER.readValue(is, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
