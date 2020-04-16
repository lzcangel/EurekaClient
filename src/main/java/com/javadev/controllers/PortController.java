package com.javadev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class PortController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/myPort")
    public String printMyPort(String user) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        String addressStr = address.getHostAddress();

        System.out.print("myPort is use");

        return "您现在调用的服务来自小许的computer，ip为:" + addressStr + "端口号为：" + port + "  user为：" + user;
    }

}
