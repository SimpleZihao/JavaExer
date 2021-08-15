package cn.simplezihao.web.servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;

// ServletContext功能之获取文件真实路径（服务器路径）
@WebServlet("/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        // 获取文件服务器路径
        String realPath = context.getRealPath("/b.txt"); // web目录下资源访问
        System.out.println(realPath);

        String c = context.getRealPath("/WEB-INF/c.txt"); //WEB-INF目录下的资源访问
        System.out.println(c);

        String a = context.getRealPath("WEB-INF/classes/a.txt"); // src目录下的资源访问
        System.out.println(a);

    }
}
