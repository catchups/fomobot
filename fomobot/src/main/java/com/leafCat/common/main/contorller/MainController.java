package com.leafCat.common.main.contorller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leafCat.coin.svc.CoinService;

@Controller
public class MainController {
	
	private static Logger logger = Logger.getLogger(MainController.class);
	
	@Autowired
	CoinService coinservice;
	
    @RequestMapping("/")
    private ModelAndView home() {
        return new ModelAndView("index");
    }
    
    @RequestMapping("/moveMain.go")
    private ModelAndView moveMain() {
    	logger.info("----> moveMain() info log"); 
    	ModelAndView mv = new ModelAndView("main");
    	
        return new ModelAndView("main");
    }
	
    @RequestMapping("/moveTable.do")
    private ModelAndView moveTable() {
        return new ModelAndView("tables");
    }

    		
}
