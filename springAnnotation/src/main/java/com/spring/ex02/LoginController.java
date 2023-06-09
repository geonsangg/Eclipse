package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
public class LoginController {
	
	@RequestMapping(value = {"/test/loginForm.do", "/test/loginFrom2.do"}, method=RequestMethod.GET)
	public ModelAndView loginFrom(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
	
	/* @RequestMapping(value = "/test/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		mav.addObject("id", id);
		mav.addObject("pwd", pwd);
		return mav;
	}*/
	
	// @RequestParam() 받을변수  == 받을변수 = request.getParameter() 
	/*@RequestMapping(value = "/test/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@RequestParam("id") String id,@RequestParam("pwd") String pwd,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("id", id);
		mav.addObject("pwd", pwd);
		return mav;
	}*/
	
	//required 생략하면 true (요청받은게 없으면 오류가 난다) /  false로 지정하면 요청받은게 없으면 null값으로 된다
	/*@RequestMapping(value = "/test/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@RequestParam(value="id", required = true) String id,@RequestParam(value="pwd", required = true) String pwd,
			@RequestParam(value="email", required = false) String email,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("id", id);
		mav.addObject("pwd", pwd);
		mav.addObject("email", email);
		return mav;
	}*/
	
	/*@RequestMapping(value = "/test/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@RequestParam Map<String, String> memberInfo,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		String id = memberInfo.get("id");
		String pwd = memberInfo.get("pwd");
		mav.addObject("id", id);
		mav.addObject("pwd", pwd);
		System.out.println("받은 id = " + id);
		System.out.println("받은 pwd = " + pwd);
		mav.addObject("memberInfo", memberInfo);
		return mav;
	}*/
	
	// @ModelAttribut("memberInfo") LoginVO loginVO
	// 전달된 매개변수에 대해 LoginVO객체를 생성하고 매개변수 이름과 같은 속성에 매개변수 값을 설정한 후 memberInfo이름으로 바인딩
	/*@RequestMapping(value = "/test/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@ModelAttribute("memberInfo") LoginVO loginVO,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		return mav;
	}*/
	
	@RequestMapping(value = "/test/login.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String login(Model model,HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		model.addAttribute("id","hong");
		model.addAttribute("pwd","1234");
		model.addAttribute("email","hong@naver.com");
		return "result2";
	}
}
