package cn.hankli.stockapp.zuulserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;


@Component
public class RouteFilter extends ZuulFilter{
	
	private static Logger log = LoggerFactory.getLogger(RouteFilter.class);
	
	@Override
	public String filterType() {
		return "route";
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
		
		log.error("In route filter!!");
		
		return null;
	}

}
