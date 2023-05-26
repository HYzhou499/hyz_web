package com.bjsxt.web.servlet;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Techinnov;
import com.bjsxt.service.SociManagerService;
import com.bjsxt.service.TechManagerService;
import com.bjsxt.service.impl.SociManagerServiceImpl;
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
 * @Date: 2023/4/23 14:55
 * @Version 1.0
 */
@WebServlet("/sociManager.do")
public class SociManagerSerlvet extends HttpServlet {
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
       Socisciinnov socisciinnov = this.createTech(req);
        try{
            SociManagerService sociManagerService =new SociManagerServiceImpl();
            sociManagerService.addTech(socisciinnov);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    private void findTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Socisciinnov socisciinnov= this.createTech(req);
        try{
            SociManagerService sociManagerService =new SociManagerServiceImpl();
            List<Socisciinnov> list = sociManagerService.findTech(socisciinnov);
            req.setAttribute("list",list);
            req.getRequestDispatcher("socimanager/viewTech.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    //获取用户提交数据
    private Socisciinnov createTech(HttpServletRequest req){
        String  biblName= req.getParameter("biblName");
        String  biblTheme= req.getParameter("biblTheme");
        String  author= req.getParameter("author");
        String postTime= req.getParameter("postTime");
        String  priSearch= req.getParameter("priSearch");
        String   twoSearch= req.getParameter("twoSearch");
        Socisciinnov socisciinnov= new Socisciinnov();
        socisciinnov.setBiblName(biblName);
        socisciinnov.setBiblTheme(biblTheme);
        socisciinnov.setAuthor(author);
        socisciinnov.setPostTime(postTime);
        socisciinnov.setPriSearch(priSearch);
        socisciinnov.setTwoSearch(twoSearch);
        return socisciinnov;
    }
    private void preUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            SociManagerService sociManagerService =new SociManagerServiceImpl();
            Socisciinnov socisciinnov = sociManagerService.findTechById(Integer.parseInt(id));
            req.setAttribute("socisciinnov",socisciinnov);
            req.getRequestDispatcher("socimanager/updateTech.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void modifyTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        Socisciinnov socisciinnov= this.createTech(req);
        socisciinnov.setId(Integer.parseInt(id));
        try{
            SociManagerService sociManagerService =new SociManagerServiceImpl();
            sociManagerService.modifyTech(socisciinnov);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void dropTech(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            SociManagerService sociManagerService =new SociManagerServiceImpl();
            sociManagerService.dropTech(Integer.parseInt(id));
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }

    }
}
