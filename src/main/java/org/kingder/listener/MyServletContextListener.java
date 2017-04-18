package org.kingder.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description 使用@WebListener注解，实现ServletContextListener接口
 * @Author jianda.deng
 * @Time 2017/4/14 16:13
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContex初始化=================");
		System.out.println(sce.getServletContext().getServerInfo());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContex销毁");
	}

}