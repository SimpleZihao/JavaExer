package cn.simplezihao.web.servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// ServletContext功能之获取MIME类型（在互联网通信中定义的一种文件数据类型，格式：大类型/小类型， 如 text/html、 image/jpeg）
@WebServlet("/servletContextDemo2")
public class ServletContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 通过HttpServlet获取
        ServletContext context = this.getServletContext();
        // 定义文件名称
        String filename = "a.jpg";
        // 获取MIME类型
        String mimeType = context.getMimeType(filename);
        System.out.println(mimeType);
    }
}
