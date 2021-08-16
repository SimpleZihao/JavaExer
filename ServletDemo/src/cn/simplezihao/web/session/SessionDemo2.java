package cn.simplezihao.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// 使用Session共享数据
@WebServlet("/sessionDemo2")
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取session
        HttpSession session = request.getSession();
        // 获取session
        Object msg = session.getAttribute("msg");
        System.out.println(msg);
    }
}
