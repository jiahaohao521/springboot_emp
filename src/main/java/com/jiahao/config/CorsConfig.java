package com.jiahao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

	/**
	 * 增加跨域允许的方法
	 * @return
	 */
	private CorsConfiguration configuration(){
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.addAllowedMethod("*");
		configuration.addAllowedHeader("*");
		configuration.addAllowedOrigin("*");
		return configuration;
	}
	
	/**
	 * 添加过滤器
	 */
	@Bean
	public CorsFilter corsFilter (){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**",  configuration());
		return new CorsFilter(source);
	}
	
}
