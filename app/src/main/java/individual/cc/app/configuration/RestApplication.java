package individual.cc.app.configuration;

import individual.cc.jar.bean.session.SimpleStatelessEjb;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class RestApplication extends ResourceConfig {

    @EJB
    private SimpleStatelessEjb simpleStatelessEjb;

    public RestApplication() {
        packages("individual.cc.app.servlet");

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(simpleStatelessEjb).to(SimpleStatelessEjb.class);
            }
        });
    }
}
