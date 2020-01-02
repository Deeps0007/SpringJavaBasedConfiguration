package com.spring.interview.SpringJavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean
	//@Bean("collegebean","collegeanotherbean")  //we can create multiple bean names from here.
	public College clgBean()
	{
		
		return new College();
	}
	
}
