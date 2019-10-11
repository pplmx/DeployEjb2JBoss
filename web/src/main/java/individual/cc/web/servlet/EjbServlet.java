package individual.cc.web.servlet;

import individual.cc.jar.bean.session.SimpleStatelessEjb;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/", "/ejbServlet"})
public class EjbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    SimpleStatelessEjb statelessBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        String msg = statelessBean.hello();
        writer.println(msg);
    }
}
