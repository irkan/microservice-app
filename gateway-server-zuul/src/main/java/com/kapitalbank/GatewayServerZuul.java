package com.kapitalbank;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayServerZuul {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerZuul.class, args);
	}

}