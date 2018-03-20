package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssh.service.TestService;

/**
 * @author simon
 * 2018/3/14
 */

@Controller
public class MainController1 {
		@Autowired
	    private TestService testService;

	    @RequestMapping(value = "test", method = RequestMethod.GET)
	    public String test(){
//	        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
	        return "test";
	    }

	    @RequestMapping(value = "springtest", method = RequestMethod.GET)
	    public String springTest(){
	        return testService.test();
	    }
}
