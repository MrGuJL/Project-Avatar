package com.heacewalker.avatar.demo.service.test;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Ignore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.heacewalker.avatar.demo.entity.AvatarDemo;
import com.heacewalker.avatar.demo.service.AvatarDemoService;

public class AvatarDemoServiceImplTest {

	private static ClassPathXmlApplicationContext context;
	
	@Ignore
	public void testSaveEntities() {
		PropertyConfigurator.configure("config/log4j.properties");
		context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		AvatarDemoService demoService = (AvatarDemoService)context.getBean("demoService");
		AvatarDemo entity = new AvatarDemo();
		entity.setObjectRemark("xx");
		entity.setModifyUser("admin");
		entity.setModifyDateTime("2016-08-01 12:59:59");
		try {
			demoService.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
