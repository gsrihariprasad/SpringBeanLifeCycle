package com.sriharilabs.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.concretepage")
public class AppConfig {
	@Bean(name = "myBook")
	public Book getBean() {
		Book book = new Book();
		book.setBookName("Mahabharat");
		return book;
	}
}
