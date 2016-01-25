/**
 * 
 */
package com.clea.zuul.filter;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.clea.zuul.commons.MethodName;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author vickrame
 *
 */
@Component
public class RequestFilter extends ZuulFilter {

	/* (non-Javadoc)
	 * @see com.netflix.zuul.IZuulFilter#run()
	 */
	public Object run() {

		RequestContext context = RequestContext.getCurrentContext();
		HttpServletResponse servletResponse = context.getResponse();
		
		
		
		
		Map<String, String>dicoHeaderRequest = context.getZuulRequestHeaders();
		dicoHeaderRequest.put("Canal", "Zuul demo Technozaure");
		
		System.out.println("hello to you");
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.netflix.zuul.IZuulFilter#shouldFilter()
	 */
	public boolean shouldFilter() {
		System.out.println("hello to you");
				return true;
	}

	/* (non-Javadoc)
	 * @see com.netflix.zuul.ZuulFilter#filterOrder()
	 */
	@Override
	public int filterOrder() {
		System.out.println("hello to you");
				return 5;
	}

	/* (non-Javadoc)
	 * @see com.netflix.zuul.ZuulFilter#filterType()
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return MethodName.PRE.getLabel();
	}

}
