package cn.boang.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j//三个时间点去拦截
public class MyInterceptor implements HandlerInterceptor {

    @Override//web接口访问前
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("[preHandle][handler({})]", handler);
        return true;
    }

    @Override//web接口return前
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("[postHandle][handler({})]", handler);
    }

    @Override//视图渲染完毕
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("[afterCompletion][handler({})]", handler, ex);
    }
}
