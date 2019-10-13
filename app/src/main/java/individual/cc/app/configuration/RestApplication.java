package individual.cc.app.configuration;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class RestApplication extends ResourceConfig {
    public RestApplication() {
        packages("individual.cc.app.servlet.HelloController");
    }
}
