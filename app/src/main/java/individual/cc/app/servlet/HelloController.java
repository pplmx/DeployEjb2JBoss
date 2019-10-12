package individual.cc.app.servlet;

import individual.cc.jar.bean.session.SimpleStatelessEjb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Stateless
@Path("/hello/")
public class HelloController {

    @EJB
    SimpleStatelessEjb statelessBean;

    @GET
    @Produces
    public String hello() {
        return statelessBean.hello();
    }
}
