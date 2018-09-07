package cn.hankli.stockapp.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.hankli.stockapp.zuulserver.filter.PreFilter;

/**
 * Zuul Server
 *
 */

@SpringBootApplication
@EnableZuulProxy
public class ZullServerApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZullServerApp.class, args);
    }
    
    
//    @Bean
//    public PreFilter preFilter() {
//    	
//    	return new PreFilter();
//    }
//    
    
    
}
