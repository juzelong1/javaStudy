package com.ju.springbootconsumer02.com.ju.service;

import com.ju.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public String getTicket() {
        return ticketService.getTicket();
    }
}
