package org.kingder.security;

/**
 * @Description 配置访问限制,以及设置一个初始用户以及用户密码
 * @Author jianda.deng
 * @Time 2017/4/14 17:33
 */
	//@Configuration
	//@EnableWebSecurity
	//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//	@Override
	//	protected void configure(HttpSecurity http) throws Exception {
	//		http
	//			.authorizeRequests()
	//			.antMatchers("/", "/home").permitAll()
	//			.anyRequest().authenticated()
	//			.and()
	//			.formLogin()
	//			.loginPage("/hello")
	//			.permitAll()
	//			.and()
	//			.logout()
	//			.permitAll();
	//	}
	//	@Autowired
	//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	//		auth
	//				.inMemoryAuthentication()
	//				.withUser("user").password("password").roles("USER");
	//	}
	//}
