package cn.simplezihao.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

// 服务器输出字符到客户端，输出字符流
@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码
        response.setContentType("text/html;charset=utf-8");
        // 获取字符输出流
        PrintWriter pw = response.getWriter();
        // 输出数据
        pw.write("你好， response");

    }
}
