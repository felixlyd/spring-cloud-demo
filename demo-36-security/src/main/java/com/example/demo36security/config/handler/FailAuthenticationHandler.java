package com.example.demo36security.config.handler;

import com.google.gson.Gson;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * class FailAuthenticationHandler
 * 登录失败的逻辑
 * @author : liuyaodong
 * @date 2021/11/15
 */
@Component("failAuthenticationHandler")
public class FailAuthenticationHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        AuthenticationException exception) throws IOException {
        httpServletRequest.setCharacterEncoding("UTF-8");
        String contentType = "application/json;charset=utf-8";
        httpServletResponse.setContentType(contentType);
        Gson gson = new Gson();
        Map<String,String> responseFail = new HashMap<>(2);
        responseFail.put("status","ERROR");
        responseFail.put("message","用户名或密码错误");
        PrintWriter out = httpServletResponse.getWriter();
        out.write(gson.toJson(responseFail));
        out.flush();
        out.close();
    }
}
