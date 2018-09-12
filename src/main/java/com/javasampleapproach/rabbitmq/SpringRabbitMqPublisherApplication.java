package com.javasampleapproach.rabbitmq;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRabbitMqPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqPublisherApplication.class, args);
	}
	
	@Bean
    public CachingConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        //connectionFactory.setUri("amqp://juagomez:vinula@localhost:5672");
    	//*******RabbitMQ-DEV
        //connectionFactory.setUri("amqps://admin:SNMYSCACWOLMHZHS@portal-ssl1233-20.bmix-dal-yp-eccd01e7-4f3d-4c90-bc67-220feeeb8e46.2126222060.composedb.com:54907/bmix-dal-yp-eccd01e7-4f3d-4c90-bc67-220feeeb8e46");
        connectionFactory.setUri("amqp://kqeniqmj:9IX8D-nhTOJRQo643vNuHeJwvwdb-NYw@fly.rmq.cloudamqp.com/kqeniqmj");
        //connectionFactory.setChannelCacheSize(100);
        return connectionFactory;
    }

}
