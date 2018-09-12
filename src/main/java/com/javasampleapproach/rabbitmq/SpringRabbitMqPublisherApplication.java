package com.javasampleapproach.rabbitmq;

import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rabbitmq.client.ConnectionFactory;

@SpringBootApplication
public class SpringRabbitMqPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqPublisherApplication.class, args);
	}
	
	@Bean
    public ConnectionFactory connectionFactory() throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setUri("amqp://kqeniqmj:9IX8D-nhTOJRQo643vNuHeJwvwdb-NYw@fly.rmq.cloudamqp.com/kqeniqmj");
        return connectionFactory;
    }
}
