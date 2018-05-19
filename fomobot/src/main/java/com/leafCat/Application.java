package com.leafCat;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer{
	
	private static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("========================== Server Sterted ================================");
		
		String coinList = "XVG,EOSDAC,WAX,LOOM,SALT,ADT,VIB,CND,DMT,BLOCK,CLOAK,GNO,LRC,NMR \n ---------------------- \n EOS는 TEST용입니다.";
		String txt = "*Upbit 상장 감지봇 Start* \n 대상 코인 목록";
		
	}
}
