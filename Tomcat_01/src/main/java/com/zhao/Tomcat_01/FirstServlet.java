package com.zhao.Tomcat_01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 赵赵
 * @version 1.0
 */
@WebServlet(name = "FirstServlet", value = "/first")
public class FirstServlet implements Servlet {

    public FirstServlet(){
        System.out.println("1.构造方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.执行init方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 只要访问FirstServlet（本类）就会执行service方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        /**
         * 获取请求的方式   get/post
         * 通过getMethod()方法获取请求
         * ServletRequest 无getMethod（）方法
         * 得用ServletResquest的子类HttpServletRequest中的getMethod()方法
         */
        HttpServletRequest hsr= (HttpServletRequest) servletRequest;
        String method=hsr.getMethod();
        System.out.println(method);



        //输出到输出框
        System.out.println("3.FirstServlet");



    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.销毁方法");
    }
}
