package com.slcupc.service;

import java.util.Map;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent event) {

    }
    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        //在session销毁的时候 把loginMap中保存的键值对清除
        String username = event.getSession().getAttribute("username").toString();
        if(username!=null){
            Map<String, String> loginMap = (Map<String, String>)event.getSession().getServletContext().getAttribute("loginMap");
            loginMap.remove(username);
            event.getSession().getServletContext().setAttribute("loginMap",loginMap);
            System.out.println(username+"用户注销！");
        }
    }

}