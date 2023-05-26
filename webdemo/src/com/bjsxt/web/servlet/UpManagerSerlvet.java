package com.bjsxt.web.servlet;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Upbibl;
import com.bjsxt.service.SociManagerService;
import com.bjsxt.service.UpManagerService;
import com.bjsxt.service.impl.SociManagerServiceImpl;
import com.bjsxt.service.impl.UpManagerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 19:56
 * @Version 1.0
 */
@WebServlet("/upManager.do")
public class UpManagerSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String flag = req.getParameter("flag");
        if("addUp".equals(flag)){
            this.addUp(req,resp);
        }else if("findUp".equals(flag)){
            this.findUp(req,resp);
        }else if("preUpdate".equals(flag)){
            this.preUpdate(req,resp);
        }else if("modifyUp".equals(flag)){
            this.modifyUp(req,resp);
        }else{
            this.dropUp(req,resp);
        }
    }

    private void addUp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Upbibl upbibl = this.createUp(req);
        try{
            UpManagerService upManagerService=new UpManagerServiceImpl();
            upManagerService.addUp(upbibl);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    private void findUp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Upbibl upbibl= this.createUp(req);
        try{
            UpManagerService upManagerService=new UpManagerServiceImpl();
            List<Upbibl> list = upManagerService.findUp(upbibl);
            req.setAttribute("list",list);
            req.getRequestDispatcher("upmanager/viewUp.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    //获取用户提交数据
    private Upbibl createUp(HttpServletRequest req){
        String  applicationdate = req.getParameter("applicationdate");
        String  username= req.getParameter("username");
        String  usersex= req.getParameter("usersex");
        String  phonenumber= req.getParameter("phonenumber");
        String  email= req.getParameter("email");
        String  biblName= req.getParameter("biblName");
        String  biblTheme= req.getParameter("biblTheme");
        String  author= req.getParameter("author");
        String  postTime= req.getParameter("postTime");
        String  keywords= req.getParameter("keywords");
        String  abstracts= req.getParameter("abstracts");
        String  remarks=req.getParameter("remarks");

        Upbibl upbibl=new Upbibl();
        upbibl.setApplicationdate(applicationdate);
        upbibl.setUsername(username);
        upbibl.setUsersex(usersex);
        upbibl.setPhonenumber(phonenumber);
        upbibl.setEmail(email);
        upbibl.setBiblName(biblName);
        upbibl.setBiblTheme(biblTheme);
        upbibl.setAuthor(author);
        upbibl.setPostTime(postTime);
        upbibl.setKeywords(keywords);
        upbibl.setAbstracts(abstracts);
        upbibl.setRemarks(remarks);
        return upbibl;
    }
    private void preUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            UpManagerService upManagerService=new UpManagerServiceImpl();
            Upbibl upbibl = upManagerService.findUpById(Integer.parseInt(id));
            req.setAttribute("upbibl",upbibl);
            req.getRequestDispatcher("upmanager/updateUp.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void modifyUp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        Upbibl upbibl = this.createUp(req);
        upbibl.setId(Integer.parseInt(id));
        try{
            UpManagerService upManagerService=new UpManagerServiceImpl();
            upManagerService.modifyUp(upbibl);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void dropUp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            UpManagerService upManagerService=new UpManagerServiceImpl();
            upManagerService.dropUp(Integer.parseInt(id));
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }

    }
}