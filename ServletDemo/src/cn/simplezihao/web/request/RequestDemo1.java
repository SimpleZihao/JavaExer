package cn.simplezihao.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/*
* request获取请求行
* */

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        // ！！！获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        // 获取Servlet路径
        String sevletPath = request.getServletPath();
        // 获取get方式请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        // !!!获取请求URI
        // URI比URL范围更大
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI:" + requestURI);
        System.out.println("URL:" + requestURL);
        // 获取协议及版本
        String protocol = request.getProtocol();
        System.out.println(protocol);
        // 获取客户机ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
