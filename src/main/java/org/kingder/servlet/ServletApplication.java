package org.kingder.servlet;

/**
 * @Description 打包成war包，需servlet3.0以上才能支持。若使用3.0以前的servlet，容器并不支持ServletContextInitializer。
 * 				这时需要增加web.xml，并在web.xml中配置DispatcherServlet来加载ApplicationContext。
 * @Author jianda.deng
 * @Time 2017/4/14 11:41
 */
//@SpringBootApplication
//public class ServletApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//
//		return builder.sources(ServletApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServletApplication.class,args);
//	}
//}
