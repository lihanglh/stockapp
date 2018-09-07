package cn.hankli.stockapp.zuulserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;


@Component
public class ErrorFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(ErrorFilter.class);
	
	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		
		log.error("Error found!!!!!!");
		
		return null;
	}
	

}
