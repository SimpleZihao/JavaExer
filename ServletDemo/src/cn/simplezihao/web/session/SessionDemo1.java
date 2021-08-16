package cn.simplezihao.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// 使用session共享数据
@WebServlet("/sessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取Session
        HttpSession session = request.getSession();
        // 存储数据
        session.setAttribute("msg", "hello session");
    }
}
