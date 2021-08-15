package cn.simplezihao.web.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// cookie快速入门
@WebServlet("/cookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.创建cookie对象
        Cookie c = new Cookie("msg", "hello");
        // 2.设置cookie存活时间
        /*
        * setMaxAge(int seconds)
        * 正数：将Cookie数据写到硬盘的文件中，持久化存储。cookie存活时间
        * 负数：默认值
        * 零：删除cookie信息
        * */
        c.setMaxAge(30); // 将cookie持久化到硬盘，30秒后自动删除cookie文件
        // 3.发送cookie
        response.addCookie(c);
    }
}
