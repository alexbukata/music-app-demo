package org.example.music.run;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.annotations.ClassInheritanceHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.ConcurrentHashSet;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.example.music.config.web.WebInitializer;
import org.springframework.web.WebApplicationInitializer;

/**
 * @author abukata
 */
public class ServerStart {

    public static void main(String[] args) throws Exception {
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setConfigurations(new Configuration[]{
                new AnnotationConfiguration(){
                    @Override
                    public void preConfigure(WebAppContext context) throws Exception {
                        super.preConfigure(context);
                        ClassInheritanceMap map = new ClassInheritanceMap();
                        ConcurrentHashMap.KeySetView<String, Boolean> objects = ConcurrentHashMap.newKeySet();
                        objects.add(WebInitializer.class.getName());
                        map.put(WebApplicationInitializer.class.getName(), objects);
                        context.setAttribute(CLASS_INHERITANCE_MAP, map);
                        _classInheritanceHandler = new ClassInheritanceHandler(map);
                    }
                }
        });

        Server server = new Server(8080);
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
