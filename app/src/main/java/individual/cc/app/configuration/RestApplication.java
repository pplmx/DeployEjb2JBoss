package individual.cc.app.configuration;

import individual.cc.app.servlet.HelloController;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * 'services', '/services', or '/services/*'
 * is all the same. Jersey will change it to be '/services/*'
 * <==>
 * <servlet-mapping>
 * <servlet-name>RestApplication</servlet-name>
 * <url-pattern>/services/*</url-pattern>
 * </servlet-mapping>
 * <p>
 * Here with the @ApplicationPath, it's just like if we configured the servlet mapping in the web.xml
 */
@ApplicationPath("services")
public class RestApplication extends ResourceConfig {

    public RestApplication() {
//        packages("individual.cc.app.servlet");
        register(HelloController.class);
    }
}
