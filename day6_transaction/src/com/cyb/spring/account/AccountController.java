package com.cyb.spring.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AccountController extends MultiActionController {
    private AccountService accService;

    /** 생성자 누락 **/
    public AccountController() {
    	System.out.println("Controller");
    }
    
    public void setAccService(AccountService accService) {
        this.accService = accService;
    }

    public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	System.out.println("ModelAndView");
        ModelAndView mav = new ModelAndView();
        accService.sendMoney();
        mav.setViewName("result");
        return mav;
    }
    
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	System.out.println("test");
        ModelAndView mav = new ModelAndView();
//        accService.sendMoney();
        mav.setViewName("result");
        return mav;
    }
}
