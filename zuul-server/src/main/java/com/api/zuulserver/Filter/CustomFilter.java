package com.api.zuulserver.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class CustomFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
		//
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		HttpServletRequest req = (HttpServletRequest) request;
		String oldURI = req.getRequestURI();

		if (oldURI.contains("/employees")) {

			request.getRequestDispatcher("/employee-service" + oldURI).forward(request, response);
			System.out.println("olduri = " + oldURI);
		}

		else if (oldURI.contains("/users")) {
			System.out.println("olduri = " + oldURI);
			request.getRequestDispatcher("/user-service" + oldURI).forward(request, response);
		}

		else {
			chain.doFilter(req, response);
		}
	}

	@Override
	public void destroy() {
	}
}
