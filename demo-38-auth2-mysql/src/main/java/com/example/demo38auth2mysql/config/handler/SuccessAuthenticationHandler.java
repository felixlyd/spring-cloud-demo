package com.example.demo38auth2mysql.config.handler;

import com.google.gson.Gson;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * class SuccessAuthenticationHandler
 * 登录成功的逻辑
 * @author : liuyaodong
 * @date 2021/11/15
 */
@Component("successAuthenticationHandler")
public class SuccessAuthenticationHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails){
            UserDetails  userDetails = (UserDetails) principal;
            String contentType = "application/json;charset=utf-8";
            httpServletResponse.setContentType(contentType);
            Gson gson = new Gson();
            Map<String,String> responseOk = new HashMap<>(2);
            responseOk.put("status","OK");
            responseOk.put("message","登录成功");
            PrintWriter out = httpServletResponse.getWriter();
            out.write(gson.toJson(responseOk));
            out.flush();
            out.close();
        }
    }
}
