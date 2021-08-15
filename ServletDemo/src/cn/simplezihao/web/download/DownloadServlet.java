package cn.simplezihao.web.download;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求参数，文件名称
        String filename = request.getParameter("fillename");
        // 2. 使用字节输入流加载文件进内存
        //2.1找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath(filename);
        //2.2 用字节流关联
        FileInputStream fis = new FileInputStream(realPath);


        // 3. 设置response的响应头
        //3.1 设置响应头类型“content-type
        String mimeType = servletContext.getMimeType(filename); // 获取文件到mime类型
        response.setHeader("content-type", mimeType);
        // 3.2 设置响应头打开方式：content-disposition
        response.setHeader("content-disposition", "attachment;filename=" + filename);

        // 解决中文文件名问题
        // 获取user-agent请求头
        String agent = request.getHeader("user-agent");
        // 使用工具类方法编码文件名即可, DownloadUtils需手动导入
        // filename = DownloadUtils.getFileName(agent], filename)

        // 4.将输入流的数据写入到输出流中
        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            sos.write(buff, 0, len);
        }
        fis.close();


    }
}
