package org.kingder.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.kingder.Filter.DemoFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 9:55
 */
@Configuration
public class WebConfiguration {
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {

		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new DemoFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("DemoFilter");
		registration.setOrder(1);
		return registration;
	}
}
