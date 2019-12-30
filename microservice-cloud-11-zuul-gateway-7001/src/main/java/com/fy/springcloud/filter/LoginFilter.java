package com.fy.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: springCloud->ZuulFilter
 * @description: 路由过滤
 * @author: fangyan
 * @create: 2019-12-31 00:56
 **/
@Component
public class LoginFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if(token == "" || token == null){
            logger.warn("此操作需要先登录系统...");
            context.setSendZuulResponse(false);// 拒绝访问      
            context.setResponseStatusCode(200);// 设置响应状态码
            try {
                //响应结果
                context.getResponse().getWriter().write("token is empty");
        } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.info("ok");
        return null;
    }
}
