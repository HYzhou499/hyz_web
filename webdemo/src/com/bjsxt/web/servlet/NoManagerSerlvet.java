package com.bjsxt.web.servlet;

import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Notices;
import com.bjsxt.service.BiblManagerService;
import com.bjsxt.service.NoticeManagerService;
import com.bjsxt.service.impl.BiblManagerServiceImpl;
import com.bjsxt.service.impl.NoticeManagerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/24 13:53
 * @Version 1.0
 */
@WebServlet("/noManager.do")
public class NoManagerSerlvet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            this.doPost(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");
            String flag = req.getParameter("flag");
            if("addNo".equals(flag)){
                this.addNo(req,resp);
            }else if("findNo".equals(flag)){
                this.findNo(req,resp);
            }else if("preUpdate".equals(flag)){
                this.preUpdate(req,resp);
            }else if("modifyNo".equals(flag)){
                this.modifyNo(req,resp);
            }else{
                this.dropNo(req,resp);
            }
        }




        private void addNo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Notices notices = this.createNo(req);
            try{
                NoticeManagerService noticeManagerService =new NoticeManagerServiceImpl();
                noticeManagerService.addNo(notices);
                resp.sendRedirect("ok.jsp");
            }catch(Exception e){
                e.printStackTrace();
                resp.sendRedirect("error.jsp");
            }
        }

        private void findNo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Notices notices= this.createNo(req);
            try{
                NoticeManagerService noticeManagerService =new NoticeManagerServiceImpl();
                List<Notices> list = noticeManagerService.findNo(notices);
                req.setAttribute("list",list);
                req.getRequestDispatcher("nomanager/viewNo.jsp").forward(req,resp);
            }catch(Exception e){
                e.printStackTrace();
                resp.sendRedirect("error.jsp");
            }
        }

        //获取用户提交数据
        private Notices createNo(HttpServletRequest req){
            String  updateTime= req.getParameter("updateTime");
            String  updateAdmin= req.getParameter("updateAdmin");
            String  remarks= req.getParameter("remarks");
            Notices notices= new Notices();
            notices.setUpdateTime(updateTime);
            notices.setUpdateAdmin(updateAdmin);
            notices.setRemarks(remarks);
            return notices;
        }
        private void preUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String userid = req.getParameter("userid");
            try{
                NoticeManagerService noticeManagerService =new NoticeManagerServiceImpl();
                Notices notices= noticeManagerService.findNoById(Integer.parseInt(userid));
                req.setAttribute("notices",notices);
                req.getRequestDispatcher("nomanager/updateNo.jsp").forward(req,resp);
            }catch(Exception e){
                e.printStackTrace();
                resp.sendRedirect("error.jsp");
            }
        }
        private void modifyNo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String userid = req.getParameter("userid");
            Notices notices= this.createNo(req);
            notices.setUserid(Integer.parseInt(userid));
            try{
                NoticeManagerService noticeManagerService =new NoticeManagerServiceImpl();
                noticeManagerService.modifyNo(notices);
                resp.sendRedirect("ok.jsp");
            }catch(Exception e){
                e.printStackTrace();
                resp.sendRedirect("error.jsp");
            }
        }
        private void dropNo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String userid = req.getParameter("userid");
            try{
                NoticeManagerService noticeManagerService =new NoticeManagerServiceImpl();
                noticeManagerService.dropNo(Integer.parseInt(userid));
                resp.sendRedirect("ok.jsp");
            }catch(Exception e){
                e.printStackTrace();
                resp.sendRedirect("error.jsp");
            }

        }



}
