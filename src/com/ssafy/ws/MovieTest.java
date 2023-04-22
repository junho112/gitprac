package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MovieTest {
	public static void main(String[] agrs) {
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		
		Audience aud = (Audience) ctx.getBean("audience");
//		Comic com = (Comic) ctx.getBean("Comic");
		aud.watch();
	}
}
