package com.javasampleapproach.rabbitmq.web;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@EndpointInject(uri="direct:sendToQueue")
    private FluentProducerTemplate producerTemplate;

	
	@RequestMapping("/send")
	public String sendMsg(@RequestParam("msg")String msg){
		producerTemplate.withBody(msg).request(); 		
//		publisher.produceMsg(msg);
		return "Done";
	}
}
