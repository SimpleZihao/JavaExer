package cn.simplezihao.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet {
    /**
     * 初始化方法，只执行一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    // 提供服务的方法,可执行多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 服务器正常关闭时执行且只执行一次
     */
    @Override
    public void destroy() {

        System.out.println("destory...");
    }
}
