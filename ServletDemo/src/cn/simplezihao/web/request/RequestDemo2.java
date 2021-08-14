package cn.simplezihao.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;


/*
 * 获取请求头数据
 * */
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取所有请求头名称
        Enumeration<String> headNames = request.getHeaderNames();

        // 遍历
        while (headNames.hasMoreElements()) {
            String name = headNames.nextElement();
            // 根据名称获取请求头的值
            String value = request.getHeader(name);
            System.out.println(name + "---" + value);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
