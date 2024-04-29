package com.cyb.spring.ex02;

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
	// value 속성 : 두 가지 요청으로 로그인 폼 보여줌 (예,로그인,수정)
	@RequestMapping(value = { "/test/loginForm.do", "/test/loginForm2.do" }, method = { RequestMethod.GET })
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}

	@RequestMapping(value = "/test/login.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		String userID = request.getParameter("userID");
		String userName = request.getParameter("userName");

		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		return mav;
	}
	
	/*
	 * @RequestMapping(value = "/test/login2.do", method = { RequestMethod.GET,
	 * RequestMethod.POST }) public ModelAndView login2(@RequestParam("userID")
	 * String userID,
	 * 
	 * @RequestParam("userName") String userName, HttpServletRequest request,
	 * HttpServletResponse response) throws Exception {
	 * request.setCharacterEncoding("utf-8"); ModelAndView mav = new ModelAndView();
	 * mav.setViewName("result");
	 * 
	 * System.out.println("userID: "+userID);
	 * System.out.println("userName: "+userName);
	 * 
	 * mav.addObject("userID", userID); mav.addObject("userName", userName); return
	 * mav; }
	 */
	
	@RequestMapping(value = "/test/login2.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login2(@RequestParam("userID") String userID,
								@RequestParam(value="userName",required=true) String userName,
								@RequestParam(value="email",required = false) String email,		
								HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		
		System.out.println("userID: "+userID);
		System.out.println("userName: "+userName);
		System.out.println("email: "+email);
	
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		mav.addObject("email: "+email);
		return mav;
	}
	@RequestMapping(value = "/test/login3.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login3(@RequestParam Map<String, String> info,
								HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		String userID = info.get("userID");
		String userName = info.get("userName");
		System.out.println("userID: "+userID);
		System.out.println("userName: "+userName);

	
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);

		return mav;
	}
	// ModelAttribute사용 - 파라미터 명과 vo객체 명 동일, @ModelAttribute 사용해서 값을 자동으로 넣어주기 때문에 이 과정 안필요함
	@RequestMapping(value = "/test/login4.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login4(@ModelAttribute("info") LoginVO loginVO,
								HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");

		System.out.println("userID: "+loginVO.getUserID());
		System.out.println("userName: "+loginVO.getUserName());

		return mav;
	}
	
	// 순수 model class를 사용 , model명만 날라가므로 반환타입은 String
	@RequestMapping(value = "/test/login5.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String login5(Model model,
								HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		model.addAttribute("userID","hong");
		model.addAttribute("userName","홍길동");


		return "result";
	}


	public LoginController() {
		// TODO Auto-generated constructor stub
	}

}
