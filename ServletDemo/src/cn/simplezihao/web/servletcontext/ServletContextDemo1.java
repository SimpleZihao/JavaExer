package cn.simplezihao.web.servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// ServletContext对象获取
@WebServlet("/servletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 通过request对象获取
        ServletContext context1 = request.getServletContext();
        // 通过HttpServlet获取
        ServletContext context2 = this.getServletContext();


        System.out.println(context1);
        System.out.println(context2);

        System.out.println(context1 == context2);
    }
}
