package org.example.music.config.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author abukata
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ThymeleafWebMvcConfigurer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
