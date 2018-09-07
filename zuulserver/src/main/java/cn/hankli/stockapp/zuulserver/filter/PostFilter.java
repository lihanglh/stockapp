package cn.hankli.stockapp.zuulserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;


@Component
public class PostFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(PostFilter.class);
	
	@Override
	public String filterType() {
		return "post";
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
		
		log.error("In post filter!!");
		
		return null;
	}

}
