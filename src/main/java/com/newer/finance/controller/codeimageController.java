package com.newer.finance.controller;


import com.newer.finance.util.SecurityCode;
import com.newer.finance.util.SecurityImage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
//@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 64000)
@RequestMapping("api")
public class codeimageController {
    @RequestMapping(value = "codeimage")
    public void finggoodnum(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
       /* response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");*/
        response.setHeader("Access-Control-Allow-Credentials","true"); //是否支持cookie跨域
        //2.生产验证吗
        String code=SecurityCode.getSecurityCode();
        //3.将验证码放入session中，方便校验值
        session.setAttribute("validCode",code);
//        System.out.println("session111: "+model.getAttribute("validCode"));
        //设置response  不缓存图片
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        //设置响应内容的格式
        response.setContentType("image/jpeg");
        //设置失效时间
        response.setDateHeader("Expires",0);

        //4.根据验证码生产图片
        // SecurityImage.createImage(code);
        ImageIO.write(SecurityImage.createImage(code),"JPEG",response.getOutputStream());
    }
}
