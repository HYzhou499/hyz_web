package com.bjsxt.web.servlet;

import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.BiblManagerService;
import com.bjsxt.service.UserManagerService;
import com.bjsxt.service.impl.BiblManagerServiceImpl;
import com.bjsxt.service.impl.UserManagerServiceImpl;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import sun.text.bidi.BidiLine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.jfree.chart.ChartUtils.encodeAsPNG;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 18:01
 * @Version 1.0
 */
@WebServlet("/biblManager.do")
public class BiblManagerSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String flag = req.getParameter("flag");
        if("addBibl".equals(flag)){
            this.addBibl(req,resp);
        }else if("findBibl".equals(flag)){
            this.findBibl(req,resp);
        }else if("preUpdate".equals(flag)){
            this.preUpdate(req,resp);
        }else if("modifyBibl".equals(flag)){
            this.modifyBibl(req,resp);
        }else if("visBibl".equals(flag)){
            this.visBibl(req,resp);
        }else{
            this.dropBibl(req,resp);
        }
    }




    private void addBibl(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Biblinfor_cn biblinfor_cn = this.createBibl(req);
        try{
            BiblManagerService biblManagerService=new BiblManagerServiceImpl();
            biblManagerService.addBibl(biblinfor_cn);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    private void findBibl(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Biblinfor_cn biblinfor_cn= this.createBibl(req);
        try{
            BiblManagerService biblManagerService = new BiblManagerServiceImpl();
            List<Biblinfor_cn> list = biblManagerService.findBibl(biblinfor_cn);
            req.setAttribute("list",list);
            req.getRequestDispatcher("biblmanager/viewBibl.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    //获取用户提交数据
    private Biblinfor_cn createBibl(HttpServletRequest req){
        String  biblName= req.getParameter("biblName");
        String  biblTheme= req.getParameter("biblTheme");
        String  author= req.getParameter("author");
        String postTime= req.getParameter("postTime");
        String  keywords= req.getParameter("keywords");
        String   abstracts= req.getParameter("abstracts");
        Biblinfor_cn biblinfor= new Biblinfor_cn();
        biblinfor.setBiblName(biblName);
        biblinfor.setBiblTheme(biblTheme);
        biblinfor.setAuthor(author);
        biblinfor.setPostTime(postTime);
        biblinfor.setKeywords(keywords);
        biblinfor.setAbstracts(abstracts);
        return biblinfor;
    }
    private void preUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            BiblManagerService biblManagerService = new BiblManagerServiceImpl();
            Biblinfor_cn biblinfor_cn = biblManagerService.findBiblById(Integer.parseInt(id));
            req.setAttribute("biblinfor_cn",biblinfor_cn);
            req.getRequestDispatcher("biblmanager/updateBibl.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void modifyBibl(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        Biblinfor_cn biblinfor_cn = this.createBibl(req);
        biblinfor_cn.setId(Integer.parseInt(id));
        try{
           BiblManagerService biblManagerService= new BiblManagerServiceImpl();
            biblManagerService.modifyBibl(biblinfor_cn);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    private void dropBibl(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            BiblManagerService biblManagerService= new BiblManagerServiceImpl();
            biblManagerService.dropBibl(Integer.parseInt(id));
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }

    }
    private void visBibl(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        try{
            BiblManagerService biblManagerService= new BiblManagerServiceImpl();
            String js= biblManagerService.visBibl();
            req.setAttribute("js", js);
            req.getRequestDispatcher("biblmanager/show.jsp").forward(req,resp);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
   /* private void QRcode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try{
            BiblManagerService biblManagerService = new BiblManagerServiceImpl();
            Users user = biblManagerService.findBiblById(Integer.parseInt(id)));
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix matrix = writer.encode(String.valueOf(user), BarcodeFormat.QR_CODE, 200, 200);


// 将QR码图像发送回浏览器
            resp.setContentType("image/png");
            MatrixToImageWriter.writeToStream(matrix, "png", resp.getOutputStream());
            req.getRequestDispatcher("biblmanager/QR.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }*/


}
