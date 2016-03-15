package com.assessment.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.client.Client;
import com.assessment.client.ClientStatus;

@RestController
public class ClientController {

    @RequestMapping("/client")
    public Client getClient(@RequestParam(value="id", defaultValue="1000") String clientId) {

        Client client = new Client();
        client.setClientId(1000);
        client.setClientName("Cleveland Clinic");
        client.setStartDate(new Date());
        client.setStatus(ClientStatus.ACTIVE);

        return client;
    }
}
