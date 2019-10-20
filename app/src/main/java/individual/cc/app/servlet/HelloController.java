package individual.cc.app.servlet;

import individual.cc.jar.bean.session.SimpleStatelessEjb;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("hello")
public class HelloController {

    @EJB
    SimpleStatelessEjb statelessBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return statelessBean.hello();
    }
}
