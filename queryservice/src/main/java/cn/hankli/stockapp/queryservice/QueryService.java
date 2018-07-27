package cn.hankli.stockapp.queryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Stock query service
 *
 */

@SpringBootApplication
@ComponentScan("cn.hankli.stockapp")
@EntityScan("cn.hankli.stockapp.data")
@EnableJpaRepositories("cn.hankli.stockapp.data")
public class QueryService 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(QueryService.class, args);
    }
}
