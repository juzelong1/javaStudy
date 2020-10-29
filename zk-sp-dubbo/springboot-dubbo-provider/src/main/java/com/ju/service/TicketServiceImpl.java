package com.ju.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service     //在被扫描到的情况下 启动直接交给注册中心
@Component   //交给spring管理
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "居泽龙";
    }
}
