package cn.simplezihao.web.response;


import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 300;
        int height = 150;
        // 1.内存中创建一图片对象
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);

        // 2.美化图片
        // 填充背景色
        Graphics g = img.getGraphics(); // 画笔对象
        g.setColor(Color.PINK); // 设置画笔颜色
        g.fillRect(0, 0, width, height);

        // 画边框
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, width - 1, height - 1);

        String str = "ABCDEFGHIGKLMdjksahdfkjsa13453";
        // 生成随机角标
        Random ran = new Random();

        for (int i = 1; i <= 4; i++) {
            int index = ran.nextInt(str.length());
            // 获取字符
            char ch = str.charAt(index); //随机字符
            // 写验证码
            g.drawString(ch + "", width / 5*i, height / 2);
        }

        // 3.将图片输出到页面展示
        ImageIO.write(img, "jpg", response.getOutputStream());

    }
}
