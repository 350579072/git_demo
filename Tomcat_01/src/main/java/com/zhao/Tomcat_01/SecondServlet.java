package com.zhao.Tomcat_01; /**
 * @author 赵赵
 * @version 1.0
 */

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@SuppressWarnings({"all"})
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("second成功");
        //init-param    只能用servletconfig获取
        ServletConfig servletConfig=getServletConfig();
        String url=servletConfig.getInitParameter("url");
        System.out.println(url+"-----------------"+servletConfig.getServletName());
        System.out.println("=================================");
        // servletcontext对象 只能  获取 xml 中的context-param中的对象      用getinitparameter()方法
        ServletContext servletContext = getServletConfig().getServletContext();
        String username=servletContext.getInitParameter("username");
        String password=servletContext.getInitParameter("password");
        System.out.println("context.param参数username的值是："+username+"--------"+password);

        System.out.println("获取当前工程路径"+servletContext.getContextPath());
        System.out.println("工程部署的路径"+servletContext.getRealPath("/"));
        System.out.println("工程下其它部署文件的路径"+servletContext.getRealPath("/css"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
