package cn.simplezihao.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// 服务器输出到客户端，字节流
@WebServlet("/responseDemo4")
public class responseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        // 获取字节输出流
        ServletOutputStream sos = response.getOutputStream();
        // 输出数据
        sos.write("你好".getBytes(StandardCharsets.UTF_8));

    }
}
