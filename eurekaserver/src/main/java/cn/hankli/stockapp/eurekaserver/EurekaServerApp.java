package cn.hankli.stockapp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaServerApp.class, args);
    }
}
