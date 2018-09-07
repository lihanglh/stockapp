package cn.hankli.stockapp.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Stock trade service
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@MapperScan("cn.hankli.stockapp.trade.repository")
public class TradeServiceApp {
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
    public static void main( String[] args )
    {
    	SpringApplication.run(TradeServiceApp.class, args);
    }
}
