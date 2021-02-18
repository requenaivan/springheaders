package co.com.spring.web.app.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Class for Log Headers to all requests
 * @author Ivan Javier Requena
 *
 */
@Component
@Order(2)
public class HeadersValidatorFilter implements Filter {

	Logger logger = LoggerFactory.getLogger(HeadersValidatorFilter.class);

	/**
	 * Filter to log headers
	 */
	@Override
	public void doFilter(ServletRequest request,  ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		Enumeration<String> headerNames = req.getHeaderNames();

		if (headerNames != null) {
			while (headerNames.hasMoreElements()) {
				logger.info("Header: " + req.getHeader(headerNames.nextElement()));
			}
		}
		chain.doFilter(request, response);
	}
}