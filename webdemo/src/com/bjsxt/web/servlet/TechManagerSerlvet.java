package com.bjsxt.web.servlet;


import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Techinnov;
import com.bjsxt.service.BiblManagerService;
import com.bjsxt.service.TechManagerService;
import com.bjsxt.service.impl.BiblManagerServiceImpl;
import com.bjsxt.service.impl.TechManagerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/21 13:31
 * @Version 1.0
 */
@WebServlet("/techManager.do")
public class TechManagerSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String flag = req.getParameter("flag");
        if("addTech".equals(flag)){
            this.addTech(req,resp);
        }else if("findTech".equals(flag)){
            this.findTech(req,resp);
        }else if("preUpdate".equals(flag)){
            this.preUpdate(req,resp);
        }else if("modifyTech".equals(flag)){
            this.modifyTech(req,resp);
        }else{
            this.dropTech(req,resp);
        }
    }

    private void addTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Techinnov techinnov = this.createTech(req);
        try{
            TechManagerService techManagerService =new TechManagerServiceImpl();
            techManagerService.addTech(techinnov);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    private void findTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Techinnov techinnov= this.createTech(req);
        try{
            TechManagerService techManagerService = new TechManagerServiceImpl();
            List<Techinnov> list = techManagerService.findTech(techinnov);
            req.setAttribute("list",list);
            req.getRequestDispatcher("techmanager/viewTech.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    //获取用户提交数据
    private Techinnov createTech(HttpServletRequest req){
        String  biblName= req.getParameter("biblName");
        String  biblTheme= req.getParameter("biblTheme");
        String  author= req.getParameter("author");
        String postTime= req.getParameter("postTime");
        String  priSearch= req.getParameter("priSearch");
        String   twoSearch= req.getParameter("twoSearch");
        Techinnov techinnov = new Techinnov();
        techinnov.setBiblName(biblName);
        techinnov.setBiblTheme(biblTheme);
        techinnov.setAuthor(author);
        techinnov.setPostTime(postTime);
        techinnov.setPriSearch(priSearch);
        techinnov.setTwoSearch(twoSearch);
        return techinnov;
    }
    private void preUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            TechManagerService techManagerService= new TechManagerServiceImpl();
            Techinnov techinnov = techManagerService.findTechById(Integer.parseInt(id));
            req.setAttribute("techinnov",techinnov);
            req.getRequestDispatcher("techmanager/updateTech.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void modifyTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        Techinnov techinnov= this.createTech(req);
        techinnov.setId(Integer.parseInt(id));
        try{
            TechManagerService techManagerService= new TechManagerServiceImpl();
            techManagerService.modifyTech(techinnov);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void dropTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            TechManagerService techManagerService= new TechManagerServiceImpl();
            techManagerService.dropTech(Integer.parseInt(id));
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }

    }

}
