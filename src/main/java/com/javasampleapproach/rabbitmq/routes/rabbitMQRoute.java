package com.javasampleapproach.rabbitmq.routes;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class rabbitMQRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:sendToQueue")
		 .setExchangePattern(ExchangePattern.InOnly)
		 .setHeader("rabbitmq.ROUTING_KEY", constant("test"))
		 .setHeader("rabbitmq.CONTENT_ENCODING", constant("UTF-8"))
		 .setHeader("rabbitmq.CONTENT_TYPE", constant("text/plain"))
		 .log("${body}")
		 .to("rabbitmq://jgg.direct?connectionFactory=#connectionFactory&autoDelete=false&declare=false");	
	}
}
