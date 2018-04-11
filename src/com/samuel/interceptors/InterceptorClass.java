package com.samuel.interceptors;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class InterceptorClass extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception{
		Calendar cal= Calendar.getInstance();
		int dayOfWeek= cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek==6) {
			
			response.getWriter().write("The Website is closed on Friday; please try accessing it on any other week day!!");
			return false;
		}
		return true;
	}
}
