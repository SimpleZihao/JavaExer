package cn.simplezihao.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/sessionDemo3")
public class SessionDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取session
        HttpSession session = request.getSession();
        System.out.println(session);

        /*
        * 客户端关闭后，服务器不关闭，两次获取的session默认情况下不是同一个
        * 如果需要相同，则可以创建Cookie,键为JSESSIONID，设置最大存活时间，让cookie持久化保存
        * */

        // 期望客户端关闭后，session也相同
        Cookie c = new Cookie("JSESSIONID", session.getId());
        c.setMaxAge(60*60);
        response.addCookie(c);
    }
}
