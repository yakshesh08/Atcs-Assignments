package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MulControler {


	
	@RequestMapping("/mul")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("n1"));
		
		int j=Integer.parseInt(request.getParameter("n2"));
		
		int r= i*j;
		
		ModelAndView mv= new ModelAndView();
		
		mv.setViewName("display.jsp");
		mv.addObject("result",r);
		
		return mv;
		
		
	}
	
	
	
}
