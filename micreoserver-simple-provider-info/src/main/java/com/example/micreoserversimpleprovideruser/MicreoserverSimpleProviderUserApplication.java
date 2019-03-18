package com.example.micreoserversimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class MicreoserverSimpleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicreoserverSimpleProviderUserApplication.class, args);
	}
	
	@Bean
	public RestTemplate geRestTemplate()
	{
		return new RestTemplate();
	}

}
