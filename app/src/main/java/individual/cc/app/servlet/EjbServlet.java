package individual.cc.app.servlet;

import individual.cc.jar.bean.session.SimpleStatelessEjb;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;

@WebServlet({"/", "/ejbServlet"})
public class EjbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    SimpleStatelessEjb statelessBean;

    //    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        PrintWriter writer = resp.getWriter();
//        String msg = statelessBean.hello();
//        writer.println(msg);
//    }

    @GET
    public String hello() {
        return statelessBean.hello();
    }
}
