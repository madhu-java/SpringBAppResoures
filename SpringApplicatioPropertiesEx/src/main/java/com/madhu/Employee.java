package com.madhu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
//@ConfigurationProperties(prefix="data.emp")
public class Employee {
	@Value("${data.emp.id}")
	private Integer id;
	
	@Value("${data.emp.name}")
	private String name;
	
	@Value("${data.emp.sal}")
	private Integer sal;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
