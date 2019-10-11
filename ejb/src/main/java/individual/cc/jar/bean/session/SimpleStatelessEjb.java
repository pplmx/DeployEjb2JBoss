package individual.cc.jar.bean.session;

import javax.ejb.Stateless;

@Stateless
public class SimpleStatelessEjb {
    public String hello() {
        return "hello world, EJB";
    }
}
