package cn.simplezihao.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;


// 获取请求消息体---请求参数
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取字符流
        BufferedReader br = request.getReader();
        // 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
